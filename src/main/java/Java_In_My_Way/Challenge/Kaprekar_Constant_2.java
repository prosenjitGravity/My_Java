package Java_In_My_Way.Challenge;

import ForEach.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Kaprekar_Constant_2 {
    static InputStreamReader stream = new InputStreamReader(System.in);
    static BufferedReader predator = new BufferedReader(stream);
    static int result = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the value  : ");
        int nums = Integer.parseInt(predator.readLine());
        System.out.println(Is_Keprekar_Constant(nums));
    }

    static int[] converting(int num) {
        int[] store = new int[4];
        for (int i = 0; i < store.length; i++) {
            store[i] = num % 10;
            num /= 10;
        }
        return store;
    }

    static int Ascending_Order(int n[]) {
        Arrays.sort(n);
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum * 10 + n[i];
        }
        return sum;
    }

    static int Descending_Order(int n[]) {
        Arrays.sort(n);
        int sum = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            sum = sum * 10 + n[i];
        }
        return sum;
    }

    static int Is_Keprekar_Constant(int org_value) {
        while (result != 6174) {
            result = (Descending_Order(converting(org_value)) - Ascending_Order(converting(org_value)));
            System.out.println(Descending_Order(converting(org_value)) +" - "+Ascending_Order(converting(org_value))+" result is : " + result);
            Is_Keprekar_Constant(result);
        }
        return result;
    }
}
