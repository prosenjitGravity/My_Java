package Competitive_Platform.Java_In_My_Way.Interview_Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Anagram {
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader predator = new BufferedReader(inputStreamReader);

    public static void main(String[] args) throws IOException {
        System.out.println("enter the 1st String data : ");
        String str1 = predator.readLine();
        System.out.println("enter the 2nd String data : ");
        String str2 = predator.readLine();
        System.out.println(isAnagram(str1, str2));
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] charArray1 = s1.toCharArray();
        sorting(charArray1);
        char[] charArray2 = s2.toCharArray();
        sorting(charArray2);
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }

    static void sorting(char[] array) {
        char[] arr = array;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//        for (char a : arr) {
//            System.out.println(a);
//        }
    }
}
