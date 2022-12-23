package Competitive_Platform.CodeChef;

import java.util.Scanner;

public class EnoughSpace {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        int t = predator.nextInt();
        while (t-- > 0) {
            int n = predator.nextInt();
            int x = predator.nextInt();
            int y = predator.nextInt() * 2;
            if (n >= (x + y)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
