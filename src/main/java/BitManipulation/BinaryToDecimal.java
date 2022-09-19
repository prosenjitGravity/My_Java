package BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static BitManipulation.DecimalToBinary.DecimalConvertBinary;

public class BinaryToDecimal {
    public static void main(String[] args) throws IOException {
//        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Binary value : ");
        int binary = Integer.parseInt(predator.readLine());
        int b = binary;
        int power = 0, sum = 0;
        while (binary > 0) {
            int remainder = binary % 10;
            sum = (int) (sum + (remainder * Math.pow(2, power)));
            ++power;
            binary /= 10;
        }
        System.out.println(b + " Decimal is : " + sum);
        System.out.print(sum + " Binary is : ");
        DecimalConvertBinary(sum);
    }
}
