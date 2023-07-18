package Sorting_Algorithm;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr) {
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted = false;
            for (int j = 1; j <= arr.length - i - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j] ^ arr[j - 1];
                    arr[j - 1] = arr[j] ^ arr[j - 1];
                    arr[j] = arr[j] ^ arr[j - 1];
                    sorted = true;
                }
            }
            if (!sorted) {
                break;
            }
        }
    }
}
