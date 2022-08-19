package Aptitude;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RomanToNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Roman letter : ");
        String roman = predator.readLine();
        ConvertInteger(roman.toUpperCase());

    }

    static void ConvertInteger(String s) {
        int sum = 0,value=0;
        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
            switch (s.charAt(i)) {
                case 'I':
                    System.out.println(1);
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    System.out.println("something went wrong ");
            }
        }
        System.out.println(sum);
    }

}
