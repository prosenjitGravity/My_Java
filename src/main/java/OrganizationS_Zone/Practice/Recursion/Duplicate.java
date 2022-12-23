package OrganizationS_Zone.Practice.Recursion;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 9, 5, 6, 3, 9, 8, 7, 9, 1};
        System.out.println(number(arr, 0, arr.length - 1));
    }

    static int number(int arr[], int i, int l) {
        int count = 0;
        if (i != l) {
            return 0;
        } else if (arr[i] == arr[i + 1]) {
            return count++;
        }
        i++;
        return number(arr, i, l);
    }
}
