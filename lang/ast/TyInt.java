package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class TyInt extends Tipo {
      
      public TyInt(){}
      
      public boolean match(Tipo t){
         return t instanceof TyInt; 
      }
      
      public String toString(){ return "Int"; }
      
      //public void accept(Visitor v){ v.visit(this);}
}
