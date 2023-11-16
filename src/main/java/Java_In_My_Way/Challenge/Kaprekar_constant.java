package Java_In_My_Way.Challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
/*
*
* 8640−0468  =8172
  8721−1278  =7443
  7443−3447  =3996
  9963−3699  =6264
  6642−2466  =4176
  7641−1467  =6174.
* */

public class Kaprekar_constant {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
    static int res = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("enter the value : ");
        int n = Integer.parseInt(predator.readLine());
        System.out.println(isTrue(n));
    }

    static int[] converting(int num1) {
        int[] conv = new int[4];
        for (int i = 0; i < conv.length; i++) {
            conv[i] = num1 % 10;
            num1 /= 10;
        }
        return conv;
    }

    static int ascending(int[] arr) {
        int asc = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            asc = asc * 10 + arr[i];
        }
        return asc;
    }

    static int descending(int[] arr) {
        int desc = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            desc = desc * 10 + arr[i];
        }
        return desc;
    }

    static int isTrue(int org) {
        while (res != 6174) {
            res = ((descending(converting(org))) - (ascending(converting(org))));
            System.out.println("result : " + res);
            isTrue(res);
        }
        return res;
    }
}
