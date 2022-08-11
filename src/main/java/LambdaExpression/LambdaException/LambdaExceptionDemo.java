package LambdaExpression.LambdaException;

interface DoubleNumericArray{
    double function(double[] arr)throws EmptyArrayException;
}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Array is Empty");
    }
}
public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        final double[] sum = {0};
        DoubleNumericArray dna;
        dna=(array)->{
            for (int i=0;i<array.length;i++){
                sum[0] +=array[i];
            }
            return sum[0];
        };
        System.out.println(dna.function(new double[]{1,4,7,8,5,2,3,6,9}));
    }
}
