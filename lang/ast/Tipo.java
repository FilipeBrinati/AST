package lang.ast;

public abstract class Tipo extends SuperNode {
      
      public Tipo(){
      
      }
      
      public abstract boolean match(Tipo t);
}
