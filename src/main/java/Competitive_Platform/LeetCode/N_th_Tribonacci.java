package Competitive_Platform.LeetCode;

import java.util.Scanner;

public class N_th_Tribonacci {
    public static void main(String java[]) {
        Scanner predator = new Scanner(System.in);
        System.out.println("enter the positive integer : ");
        int num = predator.nextInt();
        System.out.println(num >= 0 ? n_th_number(num) : "You have entered Negative Number");
    }

    static int n_th_number(int n) {
        if (n < 3) return n == 0 ? 0 : 1;
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]+dp[i-3];
        }
        return dp[n];
    }
}
