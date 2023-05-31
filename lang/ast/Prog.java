package lang.ast;

import java.util.HashMap; 

public class Prog extends SuperNode {
    
    private Func[] fs;
    private Data[] ds;

    public Prog(Func[] f, Data[] d){
        fs = f;
        ds =d;
    }

    public Func[] getFuncs(){   return fs;}
    public Data[] getDatas(){   return ds;}

    /*
    public String toString(){
        String s = "";
        for(Func f : fs){
           s += f.toString();
        }
        return s;
    } Tem q decidir como vai ser feito o tostring
    */

    //public void accept(Visitor v){ v.visit(this);}
}
