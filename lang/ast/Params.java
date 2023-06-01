package lang.ast;

import java.util.HashMap;
//import visitors.Visitor;

public class Params extends SuperNode{
    
    private String id;
    private Tipo ts;
    private Params[] ps;
    
    public Params(String id, Tipo ts, Params[] ps){
        this.id = id;
        this.ts = ts;
        this.ps = ps;
    }

    public String getId() {return this.id;}
    public Params[] getParams() {return this.ps;}
    public Tipo geTipo() {return this.ts;}
    
    public String toString(){
        String s = id + "::" + ts.toString();
        for(Params p:ps){
            s += "," + p.toString();
        }
        return s;
    }
    
    //public void accept(Visitor v){ v.visit(this);} 
}
