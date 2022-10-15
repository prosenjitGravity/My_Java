package Anonymous;

interface A {
    boolean isPrime(int n);
}

public class PrimeNumber {
    public static void main(String[] args) {
        int x = 10;
        A ob = (number) -> {
            if (number < 2) {
                return false;
            }
            int c = 2;
            while (c * c <= number) {
                if (number % c == 0) {
                    return false;
                }
                c++;
            }
            return true;
        };
        for (int i = 0; i <= x; i++) {
            System.out.println(i + " : " + ob.isPrime(i));
        }
    }
}
