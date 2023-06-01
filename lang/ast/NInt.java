package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class NInt extends Exp {
      
      private int l;
     
      public  NInt(int v){
           this.l = v;
      }
      
      public int getValue(){ return l;}
      
      //@Override
      public String toString(){
         return   "" + l ; 
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
