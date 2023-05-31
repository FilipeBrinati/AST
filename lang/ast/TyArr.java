package lang.ast;

import java.util.HashMap; 
 
public  class TyArr extends Tipo {
      private Tipo ts;
      
      public TyArr(Tipo t){
         ts = t;
      }
      
      public Tipo getTyArg(){
         return ts;
      }
      
      public boolean match(Tipo t){
        if(t instanceof TyArr){
            return ts.match(((TyArr)t).getTyArg());
        }
        return false;
      }

      public String toString(){
         String s = "" + ts.toString() + "[]";
         return s;
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
