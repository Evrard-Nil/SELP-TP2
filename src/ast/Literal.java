package ast;

public class Literal extends Expression {
    int val;

    public Literal(int val){
        this.val=val;
    }

    public String toString(){
        return "Literal(" + val+")";
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
