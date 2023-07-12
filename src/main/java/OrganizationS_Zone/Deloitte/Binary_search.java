package OrganizationS_Zone.Deloitte;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ans = binary_search(arr, 66, 0, arr.length - 1);
        System.out.println(ans);
    }

    private static int binary_search(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binary_search(arr, target, mid + 1, end);
        } else {
            return binary_search(arr, target, start, mid - 1);
        }
    }

}
