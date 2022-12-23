package Mathematics.LambdaExpression.Lambda_Interface;
interface MyNumber{
    double getValue();
}
public class FirstLambda {
    public static void main(String[] args){
        MyNumber my;
        my=() ->123.25;
        System.out.println("1st time getValue return  : "+my.getValue());
        my=()->Math.random()*100;
        System.out.println("2nd Time getValue return : "+my.getValue());
    }
}
