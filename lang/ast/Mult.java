package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class Mult extends BinOP {

      public Mult(Exp l, Exp r){
           super(l,r);
      }
      
      public String toString(){
         String s = getLeft().toString();
         if(getLeft() instanceof Mult || getLeft() instanceof Add){
            s = "(" + s + ")";
         }
         String ss = getRight().toString();
         if( getRight() instanceof Exp){
            ss = "(" + ss+ ")";
         }
         return   s + " * " + ss;
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
