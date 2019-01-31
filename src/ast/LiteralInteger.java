package ast;

public class LiteralInteger extends Expression {
    int val;

    public LiteralInteger(int val){
        this.val=val;
    }

    public String toString(){
        return "LiteralInteger(" + val+")";
    }

    @Override
    public String gen() {
        return null;
    }

    public int getVal() {
        return val;
    }

    @Override
    public int eval() {
        return val;
    }
}
