package Akaay_Alone.Prosenjit_Java_2_0.competitive_coding.LeetCode.Easy;

import static Akaay_Alone.Prosenjit_Java_2_0.ReadInput.read_Input;

public class Reverse_Prefix_Of_Word {
    public static void main(String[] args) {
        System.out.println("Enter word : ");
        String w = read_Input();
        System.out.println("Enter character : ");
        char ch = read_Input().charAt(0);
        System.out.println(reversePrefix(w, ch));
    }

    static public String reversePrefix(String word, char ch) {
        String newWord = "";
        int index =matchCharacter(word, ch);
        if ( index >= 0) {
            newWord = prefixReverse(word,index);
        } else {
            newWord = word;
        }
       return newWord;
    }

    static int matchCharacter(String word, char ch) {
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        return index;
    }

    static String prefixReverse(String word, int index) {
        String modified_word = "";
        for (int i = 0; i < word.length(); i++) {
            if (i <=index) {
                modified_word += word.charAt(index - i);
            } else {
                modified_word += word.charAt(i);
            }
        }
        return modified_word;
    }
}
