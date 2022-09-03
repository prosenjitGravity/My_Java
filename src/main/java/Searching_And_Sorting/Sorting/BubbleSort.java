package Searching_And_Sorting.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        System.out.println("\n sorted Array" );
        for (int i: arr){
            System.out.print(i+" ");
        }
    }

    static int[] getArray() {
        return new int[]{1, 2, 3, 4, 5, 60, 7, 8, 9, 10};
    }
}
