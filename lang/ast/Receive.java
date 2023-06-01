package lang.ast;

import java.util.HashMap;

public class Receive extends Cmd{
    private Lvalue ls;
    private Exp es;

    public Receive(Lvalue ls, Exp es){
        this.ls = ls;
        this.es = es;
    }

    public Lvalue getLvalue(){return ls;}
    public Exp getExp(){return es;}

    public String toString(){
        String s = ls.toString() + " = " + es.toString() + ";";
        return s;
    }
}
