package lang.ast;

//import visitors.Visitor;

public class Brackets extends Cmd {
    private Cmd[] c;

    public Brackets(Cmd[] c){
        this.c = c;
    }

    public Cmd[] getCmd(){return c;}

    public String toString(){
        String s = "";
        s += "{";
        for(Cmd i:c){
            s+= i.toString() + " ";
        }
        s += "}";
        return s;
    }
}
