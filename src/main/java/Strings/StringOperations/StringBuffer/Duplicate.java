package Strings.StringOperations.StringBuffer;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = predator.nextLine();
        StringBuffer sb = new StringBuffer();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        String temp = sb.toString();
        System.out.println(temp);
    }
}
