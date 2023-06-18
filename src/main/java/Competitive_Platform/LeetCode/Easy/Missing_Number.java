package Competitive_Platform.LeetCode.Easy;

public class Missing_Number {
    public static void main(String[] args){
        System.out.println(missingNumber(new int[]{0,1}));
    }
    static int missingNumber(int[] nums){
        int nSum=0;
        int sum=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            nSum+=nums[i];
        }
        return nSum<sum ?sum-nSum:nSum-sum;
    }
    /*
    *  static int missingNumber(int[] nums) {
        int max=nums[0];
        int sum=0;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           if(max<nums[i]){
               max=nums[i];
           }
       }
       return ((max*(max+1))/2)-sum;
    }*/
}
