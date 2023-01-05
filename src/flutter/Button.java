package flutter;

import java.util.ArrayList;
import java.util.List;

public class Button extends Component{
    public List<ButtonAtts> buttonAtts ;
    public Button(){
        this.buttonAtts= new ArrayList<>();
    }
    public Button(List<ButtonAtts> listt ){
        this.buttonAtts= listt;
    }
    public void addColumn_rowAtts(ButtonAtts cm ){
        this.buttonAtts.add(cm);
    }
    @Override
    public String toString() {
        String top= new String( "new Button (" )  ;
        for (ButtonAtts a: buttonAtts){
            top = top.concat(a.toString() + "\n");
        }
        top = top.concat(");");
        return top ;
    }
}
