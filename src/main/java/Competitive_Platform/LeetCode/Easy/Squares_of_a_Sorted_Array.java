package Competitive_Platform.LeetCode.Easy;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    static public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        sorting(nums);
        return nums;
    }

//    static void sorting(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j + 1] < arr[j]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }

    static int getMax(int arr[], int start,int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void sorting(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1 ;
            int max=getMax(arr,0,last);
            int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        }
    }
}
