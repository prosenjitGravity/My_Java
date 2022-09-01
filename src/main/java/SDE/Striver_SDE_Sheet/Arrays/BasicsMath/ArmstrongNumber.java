package SDE.Striver_SDE_Sheet.Arrays.BasicsMath;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = predator.nextInt();
        int value = n;
        int v = value;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println("Total digits : " + count);
        int sum = 0;
        while (value > 0) {
            int remainder = value % 10;
            sum = sum + (int) Math.pow(remainder, count);
            value = value / 10;
        }
        System.out.println("sum : " + sum);
        if (v == sum) {
            System.out.println(v + " Number is Armstrong number");
        } else {
            System.out.println(v + " Not Armstrong number");
        }
    }
}
