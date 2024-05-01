package Competitive_Platform.LeetCode.Easy;

public class Tribonacci {
    public static void main(String[] args) {
        tribonacci_series(100);
        System.out.println();
        tribonacci(10);
        System.out.println(tribonacci(10));
    }

    static public void tribonacci_series(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }

    //    process 2
    public static int tribonacci(int n) {
        int a = 0, b = 1, c = 1;
        if (n == 0) {
            return a;
        } else if (n == 1) {
            return b;
        } else if (n == 2) {
            return c;
        }
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = a + b + c;
            System.out.println("sum : "+a);
            a = b;
            b = c;
            c = sum;
        }
        return sum;
    }
}
