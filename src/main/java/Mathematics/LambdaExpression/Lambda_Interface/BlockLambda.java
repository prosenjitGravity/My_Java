package Mathematics.LambdaExpression.Lambda_Interface;
interface NumericFunction{
    int factorial(int n);
}
public class BlockLambda {
    public static void main(String[] args){
        NumericFunction nf;
        nf=(x)->{
            int fact=1;
            for(int i=1;i<=x;i++){
                fact*=i;
            }
            return fact;
        };
        System.out.println(5+"! factorial is  : "+nf.factorial(5));
    }
}