package DSAlgo.Searching_Sorting.Searching_And_Sorting.Searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BinarySearch {
    static void displayArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static int BinarySc(int arr[], int l, int h, int target) {
        while (l <= h) {
            System.out.println("Value of l is " + l);
            int mid = (l + h) / 2;
            System.out.println("Middle is  : " + mid);
            if (arr[mid] == target) {
                System.out.println(arr[mid] + " == " + target);
                System.out.println("middle is : " + mid);
                return mid;
            } else if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader predator = new BufferedReader(read);
        int memory[] = new int[]{1, 4, 7, 8, 5, 2, 3, 6, 9, 10};
        displayArr(memory);
        System.out.println("enter the the element tobe search");
        int element = Integer.parseInt(predator.readLine());
        System.out.println("BinarySc return this : " + BinarySc(memory, 0, memory.length - 1, element));
    }
}
