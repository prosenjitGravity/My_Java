package Lambda_Expression;

import java.util.Scanner;

/*
  in this code given me the String parameter;
* INPUT : abcde;
* OUTPUT : 12a1b1c2d3e5
           0+1+1+2+3+5=12;
           -+-+-+-+-+-=---
*/
public class Fibonacci_String {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the word here : ");
        String str = predator.nextLine();
        System.out.println(Manipulation_String(str));

    }

    private static String Manipulation_String(String data) {
        int sum = 0;
        int a = 0, b = 1;
        for (int i = 0; i < data.length(); i++) {
            int c = a + b;
            a = b;
            b = c;
            sum = sum + a;
        }
        String createString = "" + sum;
        int x = 0, y = 1;
        for (int i = 0; i < data.length(); i++) {
            int z = x + y;
            x = y;
            y = z;
            createString += data.charAt(i) + "" + x;
        }
        return createString;
    }
}