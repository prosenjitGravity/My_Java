package OrganizationS_Zone.IBM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Password_Without_Using_Regex {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Check The Password is valid  or not : ");
        String password = predator.readLine();
        System.out.println(isValid(password));
    }

    static String isValid(String password) {
        return checkLength(password) ? checkSpace(password) ? checkNumber(password) ? checkSpacialCharacter(password) ? checkCapitalLetter(password) ? checkSmallLetter(password) ? "The Password is Valid" : "At least 1 small character needed a-z" : "At least 1 capital Letter needed A-Z" : "At least 1 Special Character needed" : "At least 1 Number needed 0-9" : "Don't needed space" : "password minimum 8 to 15 character";
    }

    static boolean checkLength(String pass) {
        return pass.length() >= 8 && pass.length() <= 15 ? true : false;
    }

    static boolean checkSpace(String pass) {
        return !(pass.contains(" ")) ? true : false;
    }

    static boolean checkNumber(String pass)  {
        boolean number = false;
        for (int i = 0; i <= 9; i++) {
            if (pass.contains(Integer.toString(i))) {
                number = true;
            }
        }
        return number ? true : false;
    }

    static boolean checkSpacialCharacter(String pass) {
        return (pass.contains("@") || pass.contains("#")) ? true : false;
    }

    static boolean checkCapitalLetter(String pass) {
        boolean capLetter = false;
        for (int i = 65; i <= 90; i++) {
            if (pass.contains(Character.toString((char) i))) {
                capLetter = true;
            }
        }
        return capLetter ? true : false;
    }

    static boolean checkSmallLetter(String pass) {
        boolean smlLetter = false;
        for (int i = 97; i <= 122; i++) {
            if (pass.contains(Character.toString((char) i))) {
                smlLetter = true;
            }
        }
        return smlLetter ? true : false;
    }

}
