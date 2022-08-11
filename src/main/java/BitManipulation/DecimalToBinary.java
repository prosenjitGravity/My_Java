package BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DecimalToBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the decimal number : ");
        int value= Integer.parseInt(predator.readLine());
        System.out.print("binary is : ");
        DecimalConvertBinary(value);
    }
    static void DecimalConvertBinary(int decimal){
        int[] arr = new int[32];
        int count = 0;
        while (decimal != 0) {
            arr[count] = decimal % 2;
            decimal /= 2;
            ++count;
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
