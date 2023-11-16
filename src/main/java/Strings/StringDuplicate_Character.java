package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringDuplicate_Character {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("enter the word : ");
        String s = predator.readLine();
        removeDuplicate(s);
        System.out.println(removeDuplicate(s));
    }

    static String removeDuplicate(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                newString += str.charAt(i);
            }
        }
        return newString;
    }
}
