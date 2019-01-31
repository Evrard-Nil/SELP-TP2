package ast;

public class Variable extends Expression {


    public Identifier getId() {
        return id;
    }

    private Identifier id;
    public Variable(Identifier id) {
        this.id=id;
    }


    @Override
    public String toString() {
        return "Variable("+this.id.getName()+")";
    }

    @Override
    public String gen() {
        return null;
    }

    public int eval(){
        return 0;
    }
}
