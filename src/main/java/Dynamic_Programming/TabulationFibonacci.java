package Dynamic_Programming;

import java.util.Scanner;

public class TabulationFibonacci {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter teh value : ");
        int number = predator.nextInt();
        int dparr[] = new int[number + 1];
        System.out.println(Tabulation(number,dparr));

    }
    static int Tabulation(int n, int dp[]) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
