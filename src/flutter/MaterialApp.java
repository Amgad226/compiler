package flutter;
import java.util.ArrayList;
import java.util.List;
public class MaterialApp extends Component{
   public List<MaterialAppAtts> materialAppAtts ;
   public MaterialApp(){
       this.materialAppAtts= new ArrayList<>();
   }
    public MaterialApp(List<MaterialAppAtts> listt ){
        this.materialAppAtts= listt;
    }
   public void addMaterialAppAtts(MaterialAppAtts cm ){
       materialAppAtts.add(cm);
   }
    @Override
    public String toString() {
       String top= new String( "new MaterialApp (" )  ;
       for (MaterialAppAtts a: materialAppAtts){
           top = top.concat(a.toString() + "\n");
       }
        top = top.concat(");");
        return top ;
    }
}
//    : NEW MATERIAL_APP '(' materialAppAtts* ')')