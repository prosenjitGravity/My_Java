package Competitive_Platform.LeetCode.Easy;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr=twoSum(new int[]{2,11,7,15},9);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
