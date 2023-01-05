package flutter;

import java.util.List;

public class Costume extends Values{

    List<CostumeValues> costumeValues;
    public Costume(List<CostumeValues> costumeValues) {
        this.costumeValues = costumeValues;
    }

    @Override
    public String toString() {
        String top= new String( "Values.costume(" )  ;
        for (CostumeValues a: costumeValues){
            top = top.concat(a.toString() + ",");
        }
        top = top.concat(");");
        return top ;
    }
}
