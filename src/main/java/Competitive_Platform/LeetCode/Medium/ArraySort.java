package Competitive_Platform.LeetCode.Medium;

public class ArraySort {
    public static void main(String[] args){
        int[] nums=new int[]{1,2,3,4,5};
        println(nums);
        System.out.println("\nafter sorting the array is  : ");
        sortArray(nums);
        println(sortArray(nums));
    }
    static int[] sortArray(int[] nums){
        for(int i=nums.length-1;i>=1;i--){
            int didSwap=0;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
            System.out.println("runs");
        }
        return nums;
    }
    static void println(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
