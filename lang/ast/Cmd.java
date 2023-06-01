package lang.ast;

//import visitors.Visitor;

public abstract class Cmd extends SuperNode {
    
    public Cmd(){
        
    }
    
    public abstract boolean match(Cmd c);
    //public void accept(Visitor v){ v.visit(this);}
}
