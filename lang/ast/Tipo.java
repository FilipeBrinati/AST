package lang.ast;

import java.util.HashMap; 

public abstract class Tipo extends SuperNode {
      
      public Tipo(){
      
      }
      
      public abstract boolean match(Tipo t);
}
