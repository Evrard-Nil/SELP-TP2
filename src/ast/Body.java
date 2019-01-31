package ast;

import eval.State;

import java.io.IOException;
import java.util.List;

public class Body extends AST {

    private List<VarDef> defs;
    private Expression exp;

    public Body(List<VarDef> defs, Expression exp) {
        super();
        this.defs = defs;
        this.exp=exp;
    }

    @Override
    public String toString() {
        return exp.toString();
    }

    @Override
    public String gen() {
        return null;
    }

    public int eval() throws IOException {
        for (VarDef f:defs){
            f.eval();
        }


        return this.exp.eval();
    }
}
