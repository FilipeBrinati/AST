package lang.ast;

import java.util.HashMap; 

public class Pexp extends Exp{

    private Lvalue ls;
    private Tipo ts;
    private Exp es1;
    private Exps es2;
    private String id;

    public Pexp(Lvalue ls){
        this.ls = ls;
        this.ts = null;
        this.es1 = null;
        this.es2 = null;
        this.id = null;
    }
    public Pexp(Exp es1){
        this.ls = null;
        this.ts = null;
        this.es1 = es1;
        this.es2 = null;
        this.id = null;
    }
    public Pexp(Tipo ts, Exp es1){
        this.ls = null;
        this.ts = ts;
        this.es1 = es1;
        this.es2 = null;
        this.id = null;
    }
    public Pexp(Exp es1, Exps es2, String id){
        this.ls = null;
        this.ts = null;
        this.es1 = es1;
        this.es2 = es2;
        this.id = id;
    }

    public Lvalue getLvalue(){return this.ls;}
    public Tipo getTs(){return this.ts;}
    public Exp getEs1(){return this.es1;}
    public Exps getEs2(){return this.es2;}
    public String getId(){return this.id;}

    public String toString(){
        String s = "";
        if(ls != null){
            s += ls.toString();
        }
        else if(id != null && es1 != null && es2 != null){
            s += id + "(" + es2.toString() + ")[" + es1.toString() + "]"; 
        }
        else if(ts != null && es1 != null){
            s += "new " + ts.toString() + "[" + es1.toString() + "]";
        }
        else if(es1 != null){
            s += "(" + es1.toString() + ")";
        }
        return s;
    }
}
