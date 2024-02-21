package Taku_U_Forward;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Anagram {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println(isAnagram());
    }

    public static boolean isAnagram() throws IOException {
        System.out.println("Enter the first String  : ");
        String str1 = predator.readLine();
        System.out.println("Enter the Second String  : ");
        String str2 = predator.readLine();
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char arr1[] = character_sort(str1.toCharArray());
            println(arr1);
            char arr2[] = character_sort(str2.toCharArray());
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static char[] character_sort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//        println(arr);
        return arr;
    }

    static void println(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
