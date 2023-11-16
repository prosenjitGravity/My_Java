package DSAlgo.Searching_Sorting.Searching;

import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int element = predator.nextInt();
//        System.out.println(BinarySearch(array,6,0, array.length-1));
        if (BinarySearch(array, element, 0, array.length - 1) == -1) {
            System.out.println(element + " element not found");
        } else {
            System.out.println(element + " found in location is  : " + BinarySearch(array, element, 0, array.length - 1));
        }
    }

    static int BinarySearch(int arr[], int target, int start, int end) {
        if (end >= start) {
            int middle = (start + end) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (arr[middle] < target) {
                return BinarySearch(arr, target, middle + 1, end);
            } else {
                return BinarySearch(arr, target, start, end - 1);
            }
        }
        return -1;
    }
}
