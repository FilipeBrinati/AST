package lang.ast;

import java.util.HashMap;
//import visitors.Visitor;

public class Func extends SuperNode{
    
    private String id;
    private Params ps;
    private Tipo t1;
    private Tipo[] t2;
    private Cmd[] cs;
    
    public Func(String id, Params ps, Tipo t1, Tipo[] t2, Cmd[] cd){
        this.id = id;
        this.ps = ps;
        this.t1 = t1;
        this.t2 = t2;
        this.cs = cs;
    }
    
    public String getID(){ return id;} 
    public Params getParams(){ return ps;}
    public Tipo getTipo1(){ return t1;}
    public Tipo[] getTipo2(){ return t2;}
    public Cmd[] getCmd(){ return cs;} 
    
    public String toString(){
        String s = id + "(";
        s += ps.toString();
        s += ") :" + t1.toString();

        for(Tipo t:t2){
            s += ", " + t.toString();
        }
        
        s += "{";
        for(Cmd c:cs){
            s += c.toString();
        }
        s += "}";
        
        
        
        return s;
    }
    
    //public void accept(Visitor v){ v.visit(this);}
    
}
