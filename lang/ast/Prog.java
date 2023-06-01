package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class Prog extends SuperNode {
    
    private Func[] fs;
    private Data[] ds;

    public Prog(Func[] f, Data[] d){
        fs = f;
        ds =d;
    }

    public Func[] getFuncs(){   return fs;}
    public Data[] getDatas(){   return ds;}

    
    public String toString(){
        String s = "";
        if(fs.length > 0 && ds.length > 0){
            for(int i = 0; i < fs.length && i < ds.length; i++){
                if(i < fs.length)
                    s += fs.toString();
                if(i < ds.length)
                    s += ds.toString();
            }
        }
        return s;
    }

    //public void accept(Visitor v){ v.visit(this);}
}
