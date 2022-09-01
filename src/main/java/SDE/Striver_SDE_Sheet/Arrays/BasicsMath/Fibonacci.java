package SDE.Striver_SDE_Sheet.Arrays.BasicsMath;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(print(5));
        for (int i = 0; i < 5; i++) {
            System.out.println(print(i));
        }
    }

    static int print(int n) {
        if (n < 2) {
            return n;
        }
        int a=print(n-1);
        int b=print(n-2);
        return a+b;
    }
}
