package Competitive_Platform.LeetCode;

public class Pivot_Integer {
    public static void main(String[] args){
        System.out.println(pivot(8));
    }
    static int pivot(int n){
       int num=n*(n+1)/2;
       int x=(int)Math.sqrt(num);
       if((x*x)==num){
           return x;
       }else{
           return -1;
       }
    }
}
