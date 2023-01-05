package flutter;

public  class Column_row_Children extends Column_rowAtts{
    String list ;
    public Column_row_Children(String list){
        this.list=list;
    }

    @Override
    public String toString() {
        return "children:"+ list.toString();
    }
}
//    : CHILDREN':'list COMMA?

