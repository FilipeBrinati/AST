package lang.ast;

public class MReturn extends Cmd {
    private String id;
    private Exps eps;
    private Lvalue l;
    private Lvalue[] ls;
    
    public MReturn(String id, Exps eps, Lvalue l, Lvalue[] ls){
        this.id = id;
        this.eps = eps;
        this.l = l;
        this.ls = ls;
    }

    public String getId(){return id;}
    public Exps getExps(){return eps;}
    public Lvalue getLvalue(){return l;}
    public Lvalue[] getLvalues(){return ls;}

    public String toString(){
        String s = "";
        s = id + "(" + eps.toString() + ")" + "<" + l.toString();
        for(Lvalue i: ls){
            s += ", " + i.toString();
        }
        s += ">;";
        return s;
    }
}
