package Java_In_My_Way;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 500;
        monitoring(fibonacci(n));
    }

    static int[] fibonacci(int n) {
        int fibo[] = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }

    static void monitoring(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
