package lang.ast;

import java.util.HashMap;
//import visitors.Visitor;

public class True extends Exp {
      
      public True(){
           
      }
      
      public boolean getValue(){ return true;}
      
      //@Override
      public String toString(){
         return   "true"; 
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
