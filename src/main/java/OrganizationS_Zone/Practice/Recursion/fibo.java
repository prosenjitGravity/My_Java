package OrganizationS_Zone.Practice.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the positive number : ");
        int value = Integer.parseInt(predator.readLine());
        if (value >= 0) {
            for (int i = 0; i < value; i++) {
                System.out.print(print(i));
                if (i < value - 1) {
                    System.out.print(",");
                }
            }
        } else {
            System.out.println("you have entered negative value ");
        }
    }

    static int print(int n) {
        if (n <= 1) {
            return n;
        }
        int fast = print(n - 1);
        int last = print(n - 2);
        return fast + last;
    }
}
