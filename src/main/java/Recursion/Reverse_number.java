package Recursion;

public class Reverse_number {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println();
        reverse(1234);
        System.out.println(sum);
    }

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }
}
