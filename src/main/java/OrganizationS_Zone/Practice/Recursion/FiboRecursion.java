package OrganizationS_Zone.Practice.Recursion;

import java.util.Scanner;

public class FiboRecursion {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("enter the value : ");
        int value = predator.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
//public class My_Java {
//    public static void main(String[] Prosenjit){
//        System.out.println("Welcome to Prosenjit's Gravity");
//    }
//}
