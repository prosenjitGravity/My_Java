package DSAlgo.Searching_Sorting.Searching_And_Sorting.Sorting;

import java.util.Scanner;

public class CharacterSorted {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str1 = predator.nextLine();
        String str = str1.toLowerCase();
        char[] chars = str.toCharArray();
        int count = 0, count2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                count++;
            } else {
                count2++;
            }
        }
        System.out.println(str + " Have " + count + " Vowels & " + count2 + " Consonants");
        byte[] arr = str.getBytes();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (byte) temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            char ch = (char) arr[i];
            System.out.print(ch + "");
            if (i < arr.length - 1) {
                System.out.print(",");
            } else {
                System.out.print(".");
            }
        }
    }
}
