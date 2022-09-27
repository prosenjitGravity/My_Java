package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Programmer {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Decimal number : ");
        int decimal = Integer.parseInt(predator.readLine());
        System.out.println(DecimalToBinary.Binary(decimal));
        System.out.println(BinaryToOctal.Octal(decimal));
    }
}
