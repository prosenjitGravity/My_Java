package Aptitude.QTA;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner predator=new Scanner(System.in);
        System.out.println("enter the number : ");
        int m=predator.nextInt();
        System.out.println(print(m));
    }

    static boolean print(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        System.out.println(n);
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
