package Competitive_Platform.LeetCode;

public class Running_Sum_of_1d_Array {
    public static  void main(String[] args) {
        int arr[] = new int[]{1, 1, 1, 1, 1};
        int arr2[]=runningSum(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    public static int[] runningSum(int[] nums) {
        int sum=0;
        int arr1[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
                arr1[j]=sum;
            }
            sum=0;
            System.out.println();
        }
        return arr1;
    }
}

