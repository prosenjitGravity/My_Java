package Competitive_Platform.LeetCode.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Vowels_in_a_String {
    static public String sortVowels(String s) {
        char arr[] = s.toCharArray();
        ArrayList<Character> alist=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                alist.add(arr[i]);
            }
        }
        Collections.sort(alist);;
        int c = 0;
        char[] ch=new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                ch[i]= alist.get(c++);
            } else {
                ch[i]= arr[i];
            }
        }
        return new String(ch);
    }
    public static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
}
