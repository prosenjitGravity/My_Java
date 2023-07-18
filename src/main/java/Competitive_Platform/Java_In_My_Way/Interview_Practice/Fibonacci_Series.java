package Competitive_Platform.Java_In_My_Way.Interview_Practice;
import java.util.Scanner;
public class Fibonacci_Series {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the integer : ");
        int n=predator.nextInt();
        System.out.println("process1");
        series(n);
        System.out.println("process2 : "+series1(n));
        System.out.println("process3 : ");
        series2(n);

    }
    static void series(int n){
        int a=0,b=1,temp=0;
        for(int i=0;i<n;i++){
            System.out.print(a);
            temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println("\ntemp : "+temp);
    }
    static int series1(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return series1(n-1)+series1(n-2);
    }
    static void series2(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]);
            if(i!=dp.length-1){
                System.out.print(",");
            }
        }
    }
}
