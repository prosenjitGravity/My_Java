package DSAlgo.Searching_Sorting.Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the element to be search  : ");
        int element = Integer.parseInt(predator.readLine());
        if (Linear(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, element) == 1) {
            System.out.println("element is found");
        } else {
            System.out.println("element not found");
        }
    }

    static int Linear(int arr[], int target) {
        int check = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(arr[i] + " element found in " + i + "th location");
                check = 1;
            }
        }
        return check;
    }
}
