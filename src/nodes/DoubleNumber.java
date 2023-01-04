package nodes;

public class DoubleNumber extends  Number{
    double value ; ;
    public DoubleNumber(double value ){
        this. value = value ;

    }

    @Override
    public String toString() {

        return new Double(value).toString();


    }
}
