package Competitive_Platform.LeetCode.Easy;

public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {

        int max=accounts[0][0];
        for(int [] r:accounts){
            int sum=0;
            for(int c:r ){
                sum+=c;
            }
            if(max<sum){
                max=sum;
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(maximumWealth(new int[][]{{1,5},{7,3},{3,5}}));
    }
}
