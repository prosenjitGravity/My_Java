package Mathematics.LambdaExpression.Lambda;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewLambda {
    static BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the  number : ");
        int number=Integer.parseInt(predator.readLine());
//        System.out.println(armstrong(number,exponent->(number){
//            System.out.println(number);
//        }));
    }
    static  boolean armstrong(int n,int power){
        int sum=0;
        int temp=n;
        while(n!=0){
            int remainder=n%10;
            sum+=Math.pow(remainder,power);
            n/=10;
        }
        if(temp!=sum){
            return false;
        }
        return true;
    }


}
