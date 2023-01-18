package Competitive_Platform.LeetCode;

import java.util.Arrays;
import java.util.Collections;

public class Valid_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }

    static public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return (s1.length != t1.length) ? false : Compare(s1, t1);
    }

    static boolean Compare(char[] c1, char[] c2) {
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }
}
