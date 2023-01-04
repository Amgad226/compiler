package nodes;

public class IntegerNumber extends Number{

    int value ; ;
    public IntegerNumber(int value ){
        this. value = value ;

    }

    @Override
    public String toString() {

            return new Integer(value).toString();


    }
}
//            return new Float(value).toString();
//