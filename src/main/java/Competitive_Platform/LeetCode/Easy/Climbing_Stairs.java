package Competitive_Platform.LeetCode.Easy;

public class Climbing_Stairs {
    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int[] stair=new int[n];
        stair[0]=1;
        stair[1]=2;
        for(int i=2;i<n;i++){
            stair[i]=stair[i-1]+stair[i-2];
        }
        return stair[n-1];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }

}
