package Competitive_Platform.LeetCode;

public class Next_Permutation {
    public static void main(String[] args){
        nextPermutation(new int[]{3,2,1});

    }
    static void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }else {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i + i]) {
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
            }
            reverse(nums, i + 1, nums.length - 1);
        }
        System.out.println();
        for(int k:nums){
            System.out.print(k+" ");
        }
    }
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void reverse(int a[],int b,int l){
        while(b<l){
            swap(a,b++,l--);
        }
    }
}
