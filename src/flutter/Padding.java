package flutter;

import java.util.ArrayList;
import java.util.List;

public class Padding extends Component{
    List<PaddingAtts> paddingAtts;

    public Padding(List<PaddingAtts> paddingAtts) {
        this.paddingAtts = paddingAtts;
    }

    public Padding(){
        this.paddingAtts= new ArrayList<>();
    }
    public void addPaddingAtts(PaddingAtts paddingAttss){
        this.paddingAtts.add(paddingAttss);
    }

    @Override
    public String toString() {
        String string=  new String("new Padding(") ;
        for (PaddingAtts a :paddingAtts) {
            string=string.concat(a.toString()+ ",");

        }
        string =string.concat(");");
        return string;

    }
}
//    : NEW PADDING '(' paddingAtts* ')'
