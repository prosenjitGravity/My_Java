package LambdaExpression.Lambda_Interface;

interface NumericTest{
    boolean Test(int n);
}
public class EvenOdd {
    public static void main(String[] args){
        NumericTest nt;
        nt=(x)->(x%2)==0;
        if(nt.Test(10)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
