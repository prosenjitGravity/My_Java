package CodeChef;

import java.util.Scanner;

public class ConstructN {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        int t = predator.nextInt();
        while (t-- > 0) {
            int n = predator.nextInt();
            int rem = n % 7;
            if (n % 2 == 0) {
                System.out.println("Yes");
            } else if (rem % 2 ==1) {
                System.out.println("No");
            } else {
                System.out.println("yes");
            }
        }
    }
}
