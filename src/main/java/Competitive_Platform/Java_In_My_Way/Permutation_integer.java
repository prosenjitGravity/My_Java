package Competitive_Platform.Java_In_My_Way;

public class Permutation_integer {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        permute(arr, 0);
    }

    static void permute(int arr[], int first) {
        if (first == arr.length - 1) {
            System.out.println(arr);
            return;
        }
        for (int i = first; i < arr.length; i++) {
            swapping(arr, i, first);
            permute(arr, first + 1);
            swapping(arr, i, first);
        }
    }

    static void swapping(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
