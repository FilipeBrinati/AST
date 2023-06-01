package lang.ast;

import java.util.HashMap;

public class Print extends Cmd {
    private Exp es;

    public Print(Exp es){
        this.es = es;
    }

    public Exp getExp(){return es;}

    public String toString(){
        String s = "print " + es.toString() + ";";
        return s;
    }
}
