package LambdaExpression.Lambda_Interface;

interface Numbers{
    boolean Test(int a,int b);
}
public class LambdaDemo3 {
    public static void main(String[] args){
        Numbers number;
        number=(x,y)->(x%y)==0;
        System.out.println(""+number.Test(10,2));
    }
}
