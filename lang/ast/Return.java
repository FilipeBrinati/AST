package lang.ast;

import java.util.HashMap;

public class Return extends Cmd {
    private Exp e;
    private Exp[] es;

    public Return(Exp e, Exp[] es){
        this.e = e;
        this.es =es;
    }

    public Exp getExp(){return e;}
    public Exp[] getExps(){return es;}

    public String toString(){
        String s = "return " + e.toString();
        for(Exp i:es){
            s += ", " + i.toString();
        }
        s += ";";
        return s;
    }
}
