package ast;


public class VarDef extends AST {

    private Identifier id;
    private Expression exp;

    public VarDef(Identifier id, Expression exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "VarDef("+id.toString()+" = "+exp.toString()+")";
    }

    @Override
    public String gen() {
        return null;
    }

    public void eval() {

    }
}

