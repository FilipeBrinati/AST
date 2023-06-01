package lang.ast;

import java.util.HashMap;
//import visitors.Visitor; 

public class If extends Cmd {
      
      private Exp ts;
      private Cmd ifs;
      private Cmd els;
      
      public If(Exp ts, Cmd ifs, Cmd els){
           this.ts = ts;
           this.ifs = ifs;
           this.els = els;
      }
      
            
      public If(Exp ts, Cmd ifs){
           this.ts = ts;
           this.ifs = ifs;
           this.els = null;
      }
      
      public Exp getts(){ return ts;}
      public Cmd getThen(){ return ifs;}
      public Cmd getElse(){ return els;}
      
      public String toString(){
         String s = "?(" + ts.toString() + "){" + ifs.toString() + "}";
         String sels =  els != null ? " : {" + els.toString() + "}": "" ;
         s = s + sels;
         return  s.replace('\n', '\0'); 
      }
      
      
      //public void accept(Visitor v){ v.visit(this);}
}
