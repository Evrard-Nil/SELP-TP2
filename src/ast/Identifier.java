package ast;

public class Identifier {
    private String name;
    
    public Identifier(String name) {
        this.name = name;
    }

    public String toString() {
        return "Identifier :" + this.name;
    }
    public String getName(){
        return this.name;
    }
}

