package DSAlgo.Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchIterative {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the element : ");
        int element = Integer.parseInt(predator.readLine());
//        System.out.println(Binary(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, element));
        if (Binary(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, element) == -1) {
            System.out.println("element " + element + " not found");
        } else {
            System.out.println("element found in : " + Binary(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, element) + " location");
        }
    }
    static int Binary(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
