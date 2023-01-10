package Competitive_Platform.LeetCode;

public class Largest_Number {
    public static void main(String[] args){
        System.out.println(largestNumber(getArr()));
    }
    static String largestNumber(int[] nums){
        String s="";
        for(int i=0;i<nums.length;i++){
            s+=nums[nums.length-1-i];
        }
        return s;
    }
    static int[] getArr(){
        return new int[]{3,30,34,5,9};
    }
}
