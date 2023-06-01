package lang.ast;


import java.util.HashMap; 
//import visitors.Visitor;

public class Negative extends Exp {
      
      Exp e; 
      
      public Negative(Exp l){
           e = l;
      }
      
      public Exp getExp(){ return e; }
      public String toString(){
         String s = "-" + e.toString();
         return   s ;
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
