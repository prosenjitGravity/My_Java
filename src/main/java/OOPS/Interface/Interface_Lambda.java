package OOPS.Interface;

interface CheckPrime {
    boolean isPrime(int n);
}

public class Interface_Lambda {
    public static void main(String[] args) {
        CheckPrime prime = (x) -> {
            if (x == 0 || x == 1) {
                return false;
            } else {
                int c = 2;
                while (c * c <= x) {
                    if (x % c == 0) {
                        return false;
                    }
                    c++;
                }
            }
            return true;
        };
        System.out.println("Check prime numbers ");
        for (int i = 0; i < 10; i++) {
            if (prime.isPrime(i)) {
                System.out.println(i + " is prime number");
            } else {
                System.out.println(i + " is composite number");
            }
        }
    }
}
