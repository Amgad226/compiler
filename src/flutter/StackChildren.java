package flutter;

public class StackChildren extends StackAtts{
    String list ;
    public StackChildren(String list){
        this.list=list;
    }

    @Override
    public String toString() {
        return "children:"+ list.toString();
    }
}