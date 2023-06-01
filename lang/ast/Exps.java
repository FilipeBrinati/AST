package lang.ast;

public class Exps extends SuperNode{
    private Exp e;
    private Exp[] es;

    public Exps( Exp e, Exp[] es){
        this.e = e;
        this.es = es;
    }

    public Exp getExp(){return e;}
    public Exp[] getExps(){return es;}

    public String toString(){
        String s = "";
        s += e.toString();
        for(Exp i: es){
            s += "," + i.toString();
        }
        return s;
    }
}
