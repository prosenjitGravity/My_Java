package Mathematics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number1 = sc.nextInt();
        int number2 = number1;
        while (number1 > 0) {
            int remainder = number1 % 10;
            sum = sum * 10 + remainder;
            number1 = number1 / 10;
        }
        String check = (sum == number2) ? "Yes" : "No";
        System.out.println(check);
    }
}
