package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class And extends BinOP {

      public And(Exp l, Exp r){
           super(l,r);
      }
      
      public String toString(){
         String s = getLeft().toString();
         String ss = getRight().toString();
         if(getRight() instanceof Exp){
            ss = "(" + ss + ")";
         }
         return   s + " && " + ss;
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
