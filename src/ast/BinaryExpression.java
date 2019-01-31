package ast;

import java.io.IOException;

public class BinaryExpression extends Expression {
    Op op;

    Expression exp1;
    Expression exp2;

    public BinaryExpression(Op op, Expression exp1, Expression exp2) {
        this.op = op;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public String toString(){
        return "BinaryExpression(" + op+","+exp1+","+exp2+")";
    }

    @Override
    public int eval() throws IOException {
        switch (this.op){
            case MINUS:
                return exp1.eval() - exp2.eval();
            case HIGH:
                return  exp1.eval()>exp2.eval()? 1: 0;
            case LESS:
                return  exp1.eval()<exp2.eval()? 1: 0;
            case PLUS:
                return exp1.eval()+exp2.eval();
            case TIMES:
                return exp1.eval()*exp2.eval();
            case DIVIDE:
                return exp1.eval()/exp2.eval();
            case EQUALS:
                return  exp1.eval()==exp2.eval()? 1: 0;
            case NOTEQUAL:
                return exp1.eval()!= exp2.eval()? 1:0;
            case EQUAL_OR_LESS:
                return exp1.eval()<= exp2.eval()? 1:0;
            case AND:
                return exp1.eval()!=0 && exp2.eval()!=0? 1:0;
            case OR:
                return exp1.eval()!=0 || exp2.eval()!=0? 1:0;
            case EQUAL_OR_HIGHER:
                return exp1.eval()>= exp2.eval()? 1:0;
            default:
                throw new ArithmeticException();
        }
    }
    @Override
    public String gen() {
        return "(" + exp1.gen() + Op.gen(op) + exp2.gen() + ")";
    }
}
