package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class NFloat extends Exp {
      
      private float l;
     
      public  NFloat(float v){
           this.l = v;
      }
      
      public float getValue(){ return l;}
      
      //@Override
      public String toString(){
         return   "" + l ; 
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}
