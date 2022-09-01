package Dynamic_Programming;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        System.out.println("enter the number : ");
        Scanner predator=new Scanner(System.in);
        int value=predator.nextInt();
        int arr[]=new int[value+1];
        fibo(value,arr);
        System.out.println(fibo(value,arr));
    }
    static int fibo(int n,int dp[]){
        if(n==1||n==0){
            return n;
        }
        if(dp[n]==-1){
            return dp[n];
        }
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }
}
