package lang.ast;

import java.util.HashMap; 

public class Lvalue extends Exp{

    private String id;
    private Lvalue ls;
    private Exp es;

    public Lvalue(String id){
        this.id = id;
        ls = null;
        es = null;
    }

    public Lvalue(Lvalue ls, Exp es){
        this.id = null;
        this.ls = ls;
        this.es = es;
    }

    public Lvalue(String id, Lvalue ls){
        this.id = id;
        this.ls = ls;
        this.es = null;
    }

    public String getId(){return id;}
    public Lvalue getLvalue(){return ls;}
    public Exp getExp(){return es;}

    public String toString(){
        String s = "";
        if(id != null && ls != null){
            s += ls.toString() + id;
        }
        else if(ls != null && es != null){
            s += ls.toString() + "[" + es.toString() + "]";
        }
        else if(id != null){
            s += id;
        }
        return s;
    }
}
