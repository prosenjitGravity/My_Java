package Competitive_Platform.LeetCode.Medium;

public class Find_first_and_last_position {
    public static void main(String[] args){
        System.out.println(searchRange(new int[]{5,7,7,8,8,10},8).length);
    }
    static public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1;
        int count=0;
        int nums1[] = new int[2];
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                nums1[++count]=mid;
                return nums1;
            }
            if(nums[mid]<target){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return count<1?new int[]{-1,-1}:nums1;
    }
}
