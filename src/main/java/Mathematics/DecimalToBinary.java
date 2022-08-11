package Mathematics;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int decimal = sc.nextInt();
        int bin = 0, i = 1;
        while (decimal > 0) {
            int remainder = decimal % 2;
            decimal /= 2;
            bin += remainder * i;
            i *= 10;
        }
        System.out.println(bin);
    }
}
