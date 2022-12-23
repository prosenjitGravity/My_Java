package Competitive_Platform.LeetCode;

import java.util.Arrays;

/*
* questions number 75
*
* Input: nums = [2,0,2,1,1,0]
  Output: [0,0,1,1,2,2]
  *
  * Input: nums = [2,0,1]
Output: [0,1,2]
* */
public class Sort_Colors {
    public static void main(String[] args){
        sortColors(new int[]{2,0,2,1,1,0});
    }
    static void  sortColors(int [] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for (int i:nums){
            System.out.println(i);
        }
    }
}
