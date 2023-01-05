package flutter;

import java.util.ArrayList;
import java.util.List;

public class Column extends Component{
    public List<Column_rowAtts> column_rowAtts ;
    public Column(){
        this.column_rowAtts= new ArrayList<>();
    }
    public Column(List<Column_rowAtts> listt ){
        this.column_rowAtts= listt;
    }
    public void addColumn_rowAtts(Column_rowAtts cm ){
        this.column_rowAtts.add(cm);
    }
    @Override
    public String toString() {
        String top= new String( "new Column (" )  ;
        for (Column_rowAtts a: column_rowAtts){
            top = top.concat(a.toString() + "\n");
        }
        top = top.concat(");");
        return top ;
    }
}


//    NEW COLUMN '(' column_rowAtts* ')'
