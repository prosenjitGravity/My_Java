package OrganizationS_Zone.Accenture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PrimeNumber {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the value : ");
        int nums = Integer.parseInt(predator.readLine());
        System.out.println(checkPrime(nums));
    }

    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while ((c * c) <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
