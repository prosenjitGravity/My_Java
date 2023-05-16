package Java_In_My_Way.Interview_Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Decimal_To_Binary {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("enter the decimal number : ");
        int decimal = 8;
        Decimal_To_Binary convert = new Decimal_To_Binary();
        System.out.println("converted binary number is : " + convert.binary(decimal));

    }

    public int binary(int d) {
        int b = 0, i = 1;
        while (d != 0) {
            int rem = d % 2;
            System.out.println("the remainder is : " + rem+" "+i);
            b += rem * i;
            d /= 2;
            i *= 10;
        }
        return b;
    }
}
