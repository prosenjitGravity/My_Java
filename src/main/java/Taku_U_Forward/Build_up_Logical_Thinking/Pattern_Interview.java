package Taku_U_Forward.Build_up_Logical_Thinking;

import java.util.Scanner;

public class Pattern_Interview {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How Many Number you want : ");
        int n = sc.nextInt();
        pattern(n);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }
            int c = (n * 2) -i- 1;
            for (int k = i; k <c; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
