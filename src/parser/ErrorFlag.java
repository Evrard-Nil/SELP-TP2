package parser;

public class ErrorFlag {


    private static boolean flagState = false;

    public static void setFlag() {
        flagState =true;
    }

    public static void reset() {
        flagState = false;
    }

    public static boolean getFlag() {
        return flagState;
    }
}
