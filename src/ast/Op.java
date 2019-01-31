package ast;

import java.io.IOException;

public enum Op {

    PLUS {
        @Override
        public String toString() {
            return "PLUS";
        }
    },
    MINUS {
        @Override
        public String toString() {
            return "MINUS";
        }
    },
    TIMES {
        @Override
        public String toString() {
            return "TIMES";
        }
    },
    DIVIDE {
        @Override
        public String toString() {
            return "DIVIDE";
        }
    },
    EQUALS {
        @Override
        public String toString() {
            return "EQUALS";
        }
    },
    NOTEQUAL {
        @Override
        public String toString() { return "NOTEQUAL"; }
    },
    LESS {
        @Override
        public String toString() { return "LESS"; }
    },
    HIGH {
        @Override
        public String toString() { return "HIGH"; }
    },
    EQUAL_OR_HIGHER {
        @Override
        public String toString() { return "EQUAL_OR_HIGHER"; }
    },
    EQUAL_OR_LESS {
        @Override
        public String toString() { return "EQUAL_OR_LESS"; }
    },
    AND {
        @Override
        public String toString() { return "AND"; }
    },
    NOT {
        @Override
        public String toString() { return "NOT"; }
    },
    OR {
        @Override
        public String toString() { return "OR"; }
    };

    public static Op parseOp(String op) throws IOException {
        switch (op){
            case "+" :
                return PLUS;
            case "-" :
                return MINUS;
            case "*" :
                return TIMES;
            case "/" :
                return DIVIDE;
            case "==" :
                return EQUALS;
            case "!=" :
                return NOTEQUAL;
            case "<" :
                return LESS;
            case ">" :
                return HIGH;
            case "<=" :
                return EQUAL_OR_LESS;
            case ">=" :
                return EQUAL_OR_HIGHER;
            case "!" :
                return NOT;
            case "&&" :
                return AND;
            case "||" :
                return OR;
            default:
                throw  new IOException("Can't parse OP, text doesn't match any case");
        }
    }
}


