package flutter;

import java.util.ArrayList;
import java.util.List;

public  class Symmetric extends Values {
    List <HorizontalOrVertical> horizontalOrVertical;

    public Symmetric(List<HorizontalOrVertical> horizontalOrVertical) {
        this.horizontalOrVertical = horizontalOrVertical;
    }


    @Override
    public String toString() {
        String top= new String( "Values.symmetric(" )  ;
        for (HorizontalOrVertical a: horizontalOrVertical){
            top = top.concat(a.toString() + ",");
        }
        top = top.concat(");");
        return top ;
    }
}
//    | SYMMETRIC '(' horizontalOrVertical+ ')' //values.symmetric(horizontal: 4, vertical: 8)
