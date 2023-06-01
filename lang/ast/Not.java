package lang.ast;


import java.util.HashMap; 
//import visitors.Visitor;

public class Not extends Exp {
      
      Exp e; 
      
      public Not(Exp l){
           e = l;
      }
      
      public Exp getExp(){ return e; }
      public String toString(){
         String s = e.toString();
         if(! (e instanceof NInt || e instanceof NFloat || e instanceof Var || e instanceof True || e instanceof False || e instanceof Null || e instanceof NChar)){
            s = "!" + s;
         }
         return   s ;
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
