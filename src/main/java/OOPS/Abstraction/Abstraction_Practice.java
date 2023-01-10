package OOPS.Abstraction;

abstract class abstraction {
    abstract boolean isPalindrome(int n);
}

public class Abstraction_Practice {
    public static void main(String[] args) {
        abstraction abs = new abstraction() {
            @Override
            boolean isPalindrome(int n) {
                int x = n;
                int sum = 0;
                while (n != 0) {
                    int rem = n % 10;
                    sum = sum * 10 + rem;
                    n /= 10;
                }
                return sum == x ? true : false;
            }
        };
        System.out.println(abs.isPalindrome(121));
    }
}
