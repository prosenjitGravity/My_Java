package Aptitude;

public class Fibonacci {
    public static void main(String[] args){
//        int a=0,b=1,c=0;
//        for (int i=0;i<10;i++){
//            c=a+b;
//            a=b;
//            b=c;
//            System.err.println(c);
//        }
        int n=10;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        for (int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
    }
}
