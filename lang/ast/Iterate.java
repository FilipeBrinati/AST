package lang.ast;

import java.util.HashMap;

public class Iterate extends Cmd{
    private Exp es;
    private Cmd cs;

    public Iterate(Exp es, Cmd cs){
        this.es = es;
        this.cs = cs;
    }

    public Exp getExp(){return es;}
    public Cmd getCmd(){return cs;}

    public String toString(){
        String s = "";
        s += "iterate(" + es.toString() + ")" + cs.toString();
        return s;
    }
}
