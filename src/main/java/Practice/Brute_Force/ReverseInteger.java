package Practice.Brute_Force;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    static int reverse(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum * 10 + remainder;
            n = n / 10;
        }
        return sum;
    }
}
