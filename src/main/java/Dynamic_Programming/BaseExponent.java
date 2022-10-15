package Dynamic_Programming;
import java.util.Arrays;
import java.util.Scanner;
public class BaseExponent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base : ");
        int base=sc.nextInt();
        System.out.println("Enter the Exponent : ");
        int exponent=sc.nextInt();
        Integer dp[]=new Integer[exponent+2];

        for(int i=0;i<dp.length;i++) {
            if(exponent==0){
                dp[exponent]=1;
            }
            dp[i]=dp[exponent--];
        }
        for(int i=0;i<dp.length;i++){
            System.out.println(dp[i]);
        }
    }
}
