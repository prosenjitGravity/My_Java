package OrganizationS_Zone.Flipkart;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class AngstromNumber {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number : ");
        int num = Integer.parseInt(predator.readLine());
        System.out.println(isArmstrong(getArmstrong(num), num));
    }

    static int getArmstrong(int n) {
        int temp = n;
        int count = 0;
        int sum = 0;
        while (n != 0) {
            int remainder = n % 10;
            count++;
            n /= 10;
        }
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            temp /= 10;
        }
        return sum;
    }

    static boolean isArmstrong(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
