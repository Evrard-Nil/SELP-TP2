package ast;

import java.io.IOException;

public abstract class Expression extends AST {

    public abstract int eval() throws IOException;

}
