package Java_Features.KeyWord_Java.Super;

import java.util.Scanner;

class Factorial {
    int FindFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * FindFactorial(n - 1);
        }
    }
}

class User extends Factorial {
    private int value;

    User(int value) {
        this.value = value;
    }

    void monitoring() {
        System.out.println(value + "! is " + super.FindFactorial(value));
    }
}

public class ParaConsSuper {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the positive Integer value you want : ");
        int v = predator.nextInt();
        if (v > 0) {
            User are = new User(v);
            are.monitoring();
        } else {
            System.out.println("You have entered Negative Integer : " + v);
        }
    }
}
