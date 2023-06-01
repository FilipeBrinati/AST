package lang.ast;

//import visitors.Visitor;

public abstract class BinOP extends Exp {
      
      private Exp l;
      private Exp r;
      
      public BinOP(Exp l, Exp r){
           this.l = l;
           this.r = r;
      }
      
      public void setLeft(Exp n){  l = n; }
      public void setRight(Exp n){ r = n; }
      
      public Exp getLeft(){ return l;}
      public Exp getRight(){ return r;}

      //public void accept(Visitor v){ v.visit(this);}

}
