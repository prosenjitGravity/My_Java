package Competitive_Platform.LeetCode.Medium;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    //    static  public int search(int[] nums, int target) {
//
//    }
    static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
