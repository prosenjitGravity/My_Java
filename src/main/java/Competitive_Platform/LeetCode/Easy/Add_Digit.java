package Competitive_Platform.LeetCode.Easy;

public class Add_Digit {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    static public int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if (sum / 10 == 0) {
            return sum;
        } else {
            return addDigits(sum);
        }
    }
}
