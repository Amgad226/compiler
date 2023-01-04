package flutter;

public  class Children extends Column_rowAtts{
    String list ;
    public Children(String list){
        this.list=list;
    }

    @Override
    public String toString() {
        return "children:"+ list.toString();
    }
}
//    : CHILDREN':'list COMMA?

