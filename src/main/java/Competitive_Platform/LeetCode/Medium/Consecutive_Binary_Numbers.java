package Competitive_Platform.LeetCode.Medium;


public class Consecutive_Binary_Numbers {
    public static void main(String[] args) {
        System.out.println(concatenatedBinary(4));
    }

    static public int concatenatedBinary(int n) {
        String getBinary = "";
        for (int i = 1; i <= n; i++) {
            getBinary += Decimal_To_Binary(i);
        }
        return Binary_To_Decimal(Integer.parseInt(getBinary));
    }

    static long Decimal_To_Binary(int n) {
        int sum = 0;
        int increment = 1;
        while (n != 0) {
            int remainder = n % 2;
            n /= 2;
            sum += remainder * increment;
            increment = increment * 10;
        }
        return sum;
    }

    static int Binary_To_Decimal(int n) {
        System.out.println("t the n value is  : " + n);
        int result = 0;
        int power = 0;
        while (n != 0) {
            int remainder = n % 10;
            result += (remainder * Math.pow(2, power));
            ++power;
            n /= 10;
        }
        return result;
    }
}
