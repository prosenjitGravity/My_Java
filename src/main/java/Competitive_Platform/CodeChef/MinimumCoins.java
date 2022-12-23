package Competitive_Platform.CodeChef;

import java.util.Scanner;

public class MinimumCoins {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        int t = predator.nextInt();
        while (t-- > 0) {
            int rupee = predator.nextInt();
            if (rupee >=10) {
                System.out.println(rupee % 10);
            } else {
                System.out.println(rupee);
            }
        }
    }
}
