package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class Null extends Exp {
      
      public Null(){
           
      }
      
      public Exp getValue(){ return null;}
      
      //@Override
      public String toString(){
         return   "null"; 
      }
      
      //public void accept(Visitor v){ v.visit(this);}

}
