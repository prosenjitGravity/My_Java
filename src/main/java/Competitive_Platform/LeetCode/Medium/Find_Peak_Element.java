package Competitive_Platform.LeetCode.Medium;

public class Find_Peak_Element {
    public static int findPeakElement(int[] nums) {
        int start=0; int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        findPeakElement(new int[]{1,2,3,1});
    }
}
