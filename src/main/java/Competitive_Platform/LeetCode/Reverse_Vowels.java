package Competitive_Platform.LeetCode;

public class Reverse_Vowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("Hello"));
    }

    static public String reverseVowels(String s) {
        char temp;

        String store = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                store += s.charAt(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                char a = s.charAt(i);
                char b = store.charAt(i);
                temp = a;
                a = b;
                b = temp;

            }
        }
        return s;
    }
}
