/* package calc;

import eval.State;
import lexer.*;
import ast.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class CalcO {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        InputStream is = System.in;
        if ( args.length>0 ) {
            inputFile = args[0];
            is = new FileInputStream(inputFile);
        }
        System.out.println(interpret(is));
    }

    public static int interpret(InputStream is) throws IOException, UnexpectedCharacter {
        SLexer.init(is);
        State s =new State();
        //Body body =  Body.parse(SLexer.getToken(),new ArrayList<VarDef>());
        //System.out.println(body);
        //return body.eval(s);
    }

}*/
