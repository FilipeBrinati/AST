package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public  class TyFloat extends Tipo {
      
      public TyFloat(){}
      
      public boolean match(Tipo t){
         return t instanceof TyFloat; 
      }
      
      public String toString(){ return "Float"; }
      
      //public void accept(Visitor v){ v.visit(this);}
}
