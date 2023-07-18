package Competitive_Platform.Java_In_My_Way.Interview_Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Reverse_Number {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("enter teh number : ");
        int n = Integer.parseInt(predator.readLine());
        System.out.println(reverse(n));
    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}
