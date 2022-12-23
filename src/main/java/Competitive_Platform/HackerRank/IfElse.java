package Competitive_Platform.HackerRank;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = predator.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Wired");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }else{
            System.out.println("Not Wired");
        }
    }
}
