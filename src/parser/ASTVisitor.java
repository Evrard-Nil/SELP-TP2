package parser;


import ast.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends CalcBaseVisitor<AST> {

    @Override
    public AST visitLiteralInteger(CalcParser.LiteralIntegerContext ctx) {
        return new LiteralInteger(Integer.parseInt(ctx.getText()));
    }

    @Override
    public AST visitBody(CalcParser.BodyContext ctx) {
        // retrieve ASTs for definitions
        List<CalcParser.VarDefContext> varDefCtxs = ctx.varDef();
        List<VarDef> varDefs = new ArrayList<>();
        for (CalcParser.VarDefContext varDefCtx : varDefCtxs)
            varDefs.add((VarDef) visit(varDefCtx));
        // retrieve ast for expression
        Expression expr = (Expression) visit(ctx.expression());
        // return ast for program
        return new Body(varDefs, expr);
    }


    @Override
    public AST visitUnaryExpression(CalcParser.UnaryExpressionContext ctx) {
        Op op = null;
        try {
            op = Op.parseOp(ctx.UNARY().getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new UnaryExpression(op, (Expression) visit(ctx.expression()));

    }


    @Override
    public AST visitBinaryExpression(CalcParser.BinaryExpressionContext ctx) {
        // retrieve ASTs for expression
        List<CalcParser.ExpressionContext> expCtxs = ctx.expression();
        // Retrieve expression out of context
        List<Expression> exps = new ArrayList<>();
        for (CalcParser.ExpressionContext e : expCtxs)
            exps.add((Expression) visit(e));
        // Retrieve OP :
        Op op = null;
        try {
            if (ctx.MULTIPLICATIVE() != null) {
                op = Op.parseOp(ctx.MULTIPLICATIVE().getText());
            } else if (ctx.ADDITIVE() != null) {
                op = Op.parseOp(ctx.ADDITIVE().getText());
            } else if (ctx.RELATIONAL() != null) {
                op = Op.parseOp(ctx.RELATIONAL().getText());
            } else if (ctx.EQUALITY() != null) {
                op = Op.parseOp(ctx.EQUALITY().getText());
            } else if (ctx.AND() != null) {
                op = Op.AND;
            } else if (ctx.OR() != null) {
                op = Op.OR;
            } else throw new IllegalArgumentException("EXPRESSION doesn't have any valid operator");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new BinaryExpression(op, exps.get(0), exps.get(1));

    }

    @Override
    public AST visitConditionalExpression(CalcParser.ConditionalExpressionContext ctx) {
        // retrieve ASTs for expression
        List<CalcParser.ExpressionContext> expCtxs = ctx.expression();
        List<Expression> exps = new ArrayList<>();
        for (CalcParser.ExpressionContext e : expCtxs)
            exps.add((Expression) visit(e));
        return new ConditionalExpression(exps.get(0), exps.get(1), exps.get(2));
    }

    @Override
    public AST visitVarDef(CalcParser.VarDefContext ctx) {
        return new VarDef(((Variable) visit(ctx.variableId())).getId(), (Expression) visit(ctx.expression()));
    }


    @Override
    public AST visitVariable(CalcParser.VariableContext ctx) {
        return new Variable(new Identifier(ctx.getText()));
    }

    @Override
    public AST visitParentExpression(CalcParser.ParentExpressionContext ctx) {
        CalcParser.ExpressionContext exp = ctx.expression();

        if (exp instanceof CalcParser.LiteralIntegerContext) return this.visitLiteralInteger((CalcParser.LiteralIntegerContext) exp);
        else if (exp instanceof CalcParser.VariableContext) return this.visitVariable((CalcParser.VariableContext) exp);
        else if (exp instanceof CalcParser.UnaryExpressionContext)
            return this.visitUnaryExpression((CalcParser.UnaryExpressionContext) exp);
        else if (exp instanceof CalcParser.ConditionalExpressionContext)
            return this.visitConditionalExpression((CalcParser.ConditionalExpressionContext) exp);
        else if (exp instanceof CalcParser.BinaryExpressionContext)
            return this.visitBinaryExpression((CalcParser.BinaryExpressionContext) exp);
        else throw new IllegalArgumentException();
    }

    @Override
    public AST visitBooleanLiteral(CalcParser.BooleanLiteralContext ctx) {
        switch (ctx.BOOLEAN().getText()){
            case "true":
                return new BooleanLiteral(true);
            case "false":
                return new BooleanLiteral(false);
            default:
                throw new UnsupportedOperationException("Not true nor false");
        }
    }
}


