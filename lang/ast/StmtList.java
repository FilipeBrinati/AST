package lang.ast;

import java.util.HashMap; 
//import visitors.Visitor;

public class StmtList extends Cmd {
      
      private SuperNode cmd1;
      private Cmd cmd2; 
      
      public StmtList(SuperNode c1, Cmd c2){
           this.cmd1 =  c1;
           this.cmd2 =  c2;
      }
      
      public StmtList(SuperNode cmd1){
           this.cmd1 =  cmd1;
           this.cmd2 =  null;
      }
      
      public SuperNode getCmd1(){ return cmd1;} 
      public Cmd getCmd2(){ return cmd2; }
      
      //@Override
      public String toString(){
         if(cmd2 !=  null && !(cmd2 instanceof StmtList)){
              return   "{" + cmd1.toString() + cmd2.toString() ;
         }
         return  "{" + cmd1.toString() + (cmd2 != null ? cmd2.toString() + "}"  : "}") ;
      }
      
      //public void accept(Visitor v){ v.visit(this);}
}

