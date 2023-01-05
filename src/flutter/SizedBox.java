package flutter;

import java.util.ArrayList;
import java.util.List;

public class SizedBox extends Component{
    public List<SizedBoxAtts> sizedBoxAtts ;
    public SizedBox(){
        this.sizedBoxAtts= new ArrayList<>();
    }
    public SizedBox(List<SizedBoxAtts> listt ){
        this.sizedBoxAtts= listt;
    }
    public void addSizedBoxAtts(SizedBoxAtts cm ){
        sizedBoxAtts.add(cm);
    }
    @Override
    public String toString() {
        String top= new String( "new SizedBox (" )  ;
        for (SizedBoxAtts a: sizedBoxAtts){
            top = top.concat(a.toString() + "\n");
        }
        top = top.concat(");");
        return top ;
    }
}
//sizedBox
//        : NEW SIZEDBOX '(' sizedBoxAtts* ')'
//        ;
//        sizedBoxAtts
//        : width
//        | height
//        | child
//        ;