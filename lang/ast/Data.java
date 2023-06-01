package lang.ast;

import java.util.HashMap;
//import visitors.Visitor;

public class Data extends SuperNode{

    private String id; //Representa DataID
    private Decl[] decls; //Representa {decl}

    public Data(String id, Decl[] ds){
        this.id = id;
        this.decls = ds;
    }

    public String getID(){ return id;} 
    public Decl[] getDecl(){ return decls;} 

    public String toString(){
        String s = id + "{";
        for(Decl d:decls){
            s += d.toString();
        }
        s += "}";
        return s;
    }

    //public void accept(Visitor v){ v.visit(this);}
    
}
