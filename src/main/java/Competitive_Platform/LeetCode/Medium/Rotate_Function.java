package Competitive_Platform.LeetCode.Medium;

public class Rotate_Function {
    public static void maxRotateFunction(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int last=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=last;
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        maxRotateFunction(new int[]{4,3,2,6});
    }
}
