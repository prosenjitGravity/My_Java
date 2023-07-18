package Competitive_Platform.LeetCode.Easy;

import java.util.ArrayList;

public class Counting_Bits {
    public static void main(String[] args) {
        int arr[] = countBits2(5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] countBits(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = digitCount(decimal_to_binary(i));
        }
        return arr;
    }

    static int digitCount(int n) {
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }

    static int decimal_to_binary(int n) {
        int binary = 0, i = 1;
        while (n != 0) {
            int rem = n % 2;
            binary += rem * i;
            n /= 2;
            i *= 10;
        }
        return binary;
    }
//     process 2

    public static int[] countBits2(int n) {
        int[] res = new int[n+1];
        for (int i = 1; i < n; ++i)
            res[i] = res[i & (i - 1)] + 1;
        return res;
    }
}
