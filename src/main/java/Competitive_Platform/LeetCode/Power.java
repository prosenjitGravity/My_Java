package Competitive_Platform.LeetCode;

public class Power {
    public static void main(String[] args){
        System.out.println(myPow(2.00000,-2));
    }
    static double myPow(double x,int n){
        double result=1;
        for(int i=1;i<=n;i++){
            result*=x;
        }
        return result;
    }
}
