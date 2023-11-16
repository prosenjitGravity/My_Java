package Java_In_My_Way.Challenge;

public class Balanced_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 1};
        System.out.println(isBalanced(arr));
    }
    static boolean isBalanced(int[] nums) {
        int start = 0, end = nums.length - 1;
        int first_to_Mid = 0, mid_to_last = 0;
        int mid = (start + end) / 2;
        for (int i = 0; i <= mid; i++) {
            first_to_Mid += nums[i];
        }
        for (int j = mid + 1; j <= end; j++) {
            mid_to_last += nums[j];
        }
        System.out.println(first_to_Mid);
        System.out.println(mid_to_last);
        return first_to_Mid == mid_to_last;
    }
}
