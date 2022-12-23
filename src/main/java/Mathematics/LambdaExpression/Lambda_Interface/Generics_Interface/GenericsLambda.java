package Mathematics.LambdaExpression.Lambda_Interface.Generics_Interface;

interface AnonymousInterface<T>{
    T IntegerLength(T data);
}
public class GenericsLambda {
    public static void main(String[] args){
        AnonymousInterface<Integer> aiInteger;
        aiInteger=(x)->{
            int count=0;

            while(x!=0){
                int remainder=x%10;
                count++;
                x=x/10;
            }
            return count;
        };
        System.out.println(aiInteger.IntegerLength(100));
    }
}
