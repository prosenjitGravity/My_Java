package Competitive_Platform.LeetCode;

/*
*  question number :53
*   Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
* */
public class Maximum_Subarray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    static int maxSubArray(int[] nums) {
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                p+=nums[i];
            }else{
                n+=nums[i];
            }
        }
        return p>n?p+n:n+p;
    }
}
