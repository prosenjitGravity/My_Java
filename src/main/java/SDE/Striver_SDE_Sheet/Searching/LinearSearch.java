package SDE.Striver_SDE_Sheet.Searching;

import java.util.Scanner;

public class LinearSearch {
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Enter the value to be search : ");
        int target = predator.nextInt();
        if (find(array, 0, target) == -1) {
            System.out.println("Target value not found in the array");
        } else {
            System.out.println(target + " value found in : " + find(array, 0, target) + " location");
        }
    }

    static int find(int arr[], int i, int target) {
        if (i > arr.length - 1) {
            return -1;
        }
        int location;
        if (arr[i] == target) {
            location = i;
            return i;
        }
        return find(arr, i + 1, target);
    }
}
