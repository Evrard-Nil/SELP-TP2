package ast;

import java.io.IOException;

public class UnaryExpression extends Expression {

    Expression exp1;
    Op op;
    public UnaryExpression( Op op,Expression exp1) {
        this.exp1 = exp1;
        this.op = op;
    }

    public String toString(){
        return "UnaryExpression(" +op+ ','+exp1+")";
    }

    @Override
    public String gen() {
        return null;
    }

    @Override
    public int eval() throws IOException {
        if (this.op.equals(Op.MINUS) ){
            return -exp1.eval();
        }
        return exp1.eval()==0 ? 1: 0;
    }
}
