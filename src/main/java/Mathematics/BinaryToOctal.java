package Mathematics;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        System.out.println("enter the binary number");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(Decimal(b));
        System.out.println(Octal(Decimal(b)));
    }

    static int Decimal(int binary) {
        int sum = 0, power = 0;
        while (binary > 0) {
            int remainder = binary % 10;
            sum += remainder * Math.pow(2, power++);
            binary /= 10;
        }
        return sum;
    }


    static int Octal(int decimal) {
        int sum = 0, i = 1;
        while (decimal > 0) {
            int r = decimal % 8;
            decimal /= 8;
            sum += r * i;
            i *= 10;
        }
        return sum;
    }

}
