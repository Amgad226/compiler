package flutter;

import java.util.ArrayList;
import java.util.List;

public class Stack extends Component{
    public List<StackAtts> stackAtts ;
    public Stack(){
        this.stackAtts= new ArrayList<>();
    }
    public Stack(List<StackAtts> listt ){
        this.stackAtts= listt;
    }
    public void addStackAtts(StackAtts cm ){
        stackAtts.add(cm);
    }
    @Override
    public String toString() {
        String top= new String( "new Stack (" )  ;
        for (StackAtts a: stackAtts){
            top = top.concat(a.toString() + "\n");
        }
        top = top.concat(");");
        return top ;
    }
}
//    : NEW STACK '(' stackAtts* ')'

