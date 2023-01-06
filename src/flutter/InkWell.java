package flutter;

import java.util.ArrayList;
import java.util.List;

public class Inkwell extends Component{
    public List<InkwellAtts> InkwellAtts ;
    public Inkwell(){
        this.InkwellAtts= new ArrayList<>();
    }
    public Inkwell(List<InkwellAtts> listt){
        this.InkwellAtts= listt;
    }
    @Override
    public String toString() {
        String top= new String( "new InkWell (" )  ;
        for (int i = 0; i < InkwellAtts.size(); i++) {
            if (i == InkwellAtts.size() - 1) {
                top = top.concat(a.toString() + "\n");
            } else {
                top = top.concat(a.toString() + "," + "\n");
            }
        }
        top = top.concat(")");
        return top ;
    }
}
