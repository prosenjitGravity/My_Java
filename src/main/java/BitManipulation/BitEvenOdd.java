package BitManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BitEvenOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value : ");
        int a = Integer.parseInt(predator.readLine());
        if ((a & 1) == 0) {
            System.out.println(a + " element is Even");
        } else {
            System.out.println(a + " element is Odd");
        }
    }
}
