package lang.ast;

import java.util.HashMap;

public class Decl extends SuperNode{
    
    private String id;
    private Tipo t; //Representa Type (Conflita com 'Type')

    public Decl(String id, Tipo t){
        this.id = id;
        this.t = t;
    }

    public String getID(){  return id;} 
    public Tipo getType(){  return t; }

    public String toString(){
        String s = id +
            "::" +
            t.toString() +
            ";";
            return s;
    }

    //public void accept(Visitor v){ v.visit(this);}

}
