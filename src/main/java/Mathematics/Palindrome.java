package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the  number here : ");
        int n = Integer.parseInt(predator.readLine());
        int temp = n, sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum * 10 + remainder;
            n /= 10;
        }
        String check = (sum == temp) ? "true" : "false";
        System.out.println("The Palindrome is   : " + check);
        System.out.println(isPalindrome(sum, temp));
    }

    static boolean isPalindrome(int sum, int temp) {
        return (sum == temp) ? true : false;
    }
}
