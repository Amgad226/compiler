package flutter;

import java.util.ArrayList;
import java.util.List;

public class ScrollView extends Component{

    public List<ScrollViewAtts> scrollViewAtts ;
    public ScrollView(){
        this.scrollViewAtts= new ArrayList<>();
    }
    public ScrollView(List<ScrollViewAtts> listt ){
        this.scrollViewAtts= listt;
    }
    public void addscrollViewAtts(ScrollViewAtts cm ){
        this.scrollViewAtts.add(cm);
    }
    @Override
    public String toString() {
        String top= new String( "new ScrollView (" )  ;
        for (ScrollViewAtts a: scrollViewAtts){
            top = top.concat(a.toString() + "\n");
        }
        top = top.concat(");");
        return top ;
    }

}

//scrollView
//        : NEW SCROLL_VIEW '(' scrollViewAtts* ')'
//        ;
