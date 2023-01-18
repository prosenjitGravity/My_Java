package Competitive_Platform.LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [2,3]
 */
public class Find_All_Duplicate {
    public static void main(String[] args){
        System.out.println(findDuplicates(new int[]{10,2,5,10,9,1,1,4,3,7}));
    }
    static public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ar=new ArrayList<>();
        int start=0,end=nums.length-1;
        if(nums.length==1){
            return ar;
        }
        while(start<=end) {
            if (nums[start] == nums[end]) {
                ar.add(nums[start]);
            }
            start++;
            end--;

        }
    return ar;
    }
}
