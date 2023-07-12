package Competitive_Platform.LeetCode.Easy;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(digitCount(nums[i])%2==0){
                c++;
            }
        }
        return c;
    }
    public static int findNumbers2(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9 && nums[i]>99||nums[i]>999 && nums[i]>10000 || nums[i]>99999 && nums[i]>1000000){
                c++;
            }
        }
        return c;
    }
    public static int digitCount(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(findNumbers2(new int[]{12,345,2,6,7896}));
    }
}
