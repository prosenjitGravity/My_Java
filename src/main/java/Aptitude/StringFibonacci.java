package Aptitude;

public class StringFibonacci {
    public static void main(String[] args) {
        System.out.println(fibo_string("transaction"));
    }

    static String fibo_string(String data) {
        int a = 0, b = 1;
        int sum = 0;
        for (int i = 0; i < data.length(); i++) {
            int c = a + b;
            a = b;
            b = c;
            sum += a;
        }
        String newString = sum + "";
        int x = 0, y = 1;
        for (int i = 0; i < data.length(); i++) {
            int temp = x + y;
            x = y;
            y = temp;
            newString = newString + data.charAt(i) + x;
        }
        return newString;
    }
}
