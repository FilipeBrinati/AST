package lang.ast;

import java.util.HashMap;

public class Read extends Cmd {
    private Lvalue ls;

    public Read(Lvalue ls){
        this.ls = ls;
    }

    public Lvalue getLvalue(){return ls;}

    public String toString(){
        String s = "read " + ls.toString() + ";";
        return s;
    }
}
