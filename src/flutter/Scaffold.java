package flutter;

import java.util.ArrayList;
import java.util.List;

public class Scaffold extends Component{

    public List<ScaffoldAtts> scaffoldAtts ;
    public Scaffold(){
        this.scaffoldAtts= new ArrayList<>();
    }
    public Scaffold(List<ScaffoldAtts> listt ){
        this.scaffoldAtts= listt;
    }
    public void addScaffoldAtts(ScaffoldAtts cm ){
        scaffoldAtts.add(cm);
    }
    @Override
    public String toString() {
        String top= new String( "new Scaffold (" )  ;
        for (ScaffoldAtts a: scaffoldAtts){
            top = top.concat(a.toString() + "\n");
        }
        top = top.concat(");");
        return top ;
    }
}

