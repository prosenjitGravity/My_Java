package Competitive_Platform.LeetCode.Medium;

public class Divide_Two_Integer {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }

    static public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        } else {
            return dividend / divisor;
        }
    }
}
