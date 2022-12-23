package Competitive_Platform.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Grey_Code {
    public static void main(String[] args) {
        System.out.println(grayCode(3));

    }
    public static List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[]{000, 001, 011, 010, 110, 111, 101, 100};
        int array[] = new int[]{00, 01, 11, 10};
        int arr1[] = new int[]{0, 1};
        if (n == 2) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(binary_decimal(array[i]));
                list.add(binary_decimal(array[i]));
            }
        } else if (n == 3) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(binary_decimal(arr[i]));
                list.add(binary_decimal(arr[i]));
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(binary_decimal(arr1[i]));
                list.add(binary_decimal(arr1[i]));
            }
        }
        return list;
    }

    static int binary_decimal(int n) {
        int power=0,sum=0;
        while (n > 0) {
            int remainder = n % 10;
            sum = (int) (sum + (remainder * Math.pow(2, power)));
            ++power;
            n /= 10;
        }
        return sum;
    }
}
