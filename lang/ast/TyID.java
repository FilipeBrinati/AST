package lang.ast;

import java.util.HashMap; 

public class TyID extends Tipo {
      
      public TyID(){}
      
      public boolean match(Tipo t){
         return t instanceof TyID; 
      }
      
      public String toString(){ return "ID"; }
      
      //public void accept(Visitor v){ v.visit(this);}
}
