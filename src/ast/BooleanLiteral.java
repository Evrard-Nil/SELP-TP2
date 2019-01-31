package ast;

public class BooleanLiteral extends Expression {

    Boolean val;

    public BooleanLiteral(boolean val){
        this.val=val;
    }

    public String toString(){
        return "BooleanLiteral(" + val+")";
    }

    @Override
    public String gen() {
        return null;
    }

    public boolean getVal() {
        return val;
    }

    @Override
    public int eval() {
        if (val){
            return 1;
        }
        return 0;
    }
}
