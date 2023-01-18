package Competitive_Platform.LeetCode;

/*
* Input: nums = [1,3,5,6], target = 5
Output: 2
*
* Input: nums = [1,3,5,6], target = 7
Output: 4
* */
public class Insert_Position {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    static public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1 ;
        for (int i = start; i <=end; i++) {
            int mid = start + (end-start)  / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return mid + 1;
            } else {
                return mid - 1;
            }
        }
        return start;
    }

}



//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target) {
//                return i;
//            }
//            else if(nums[i] > target) {
//                return i;
//            }
//        }
//        return nums.length;