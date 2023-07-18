package Sorting_Algorithm;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 5, 6, 7, 9, 8, 10};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i - 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
