package Competitive_Platform.LeetCode.Easy;

import java.util.StringTokenizer;

public class Reverse_Word_String_iii {
    public static void main(String[] args){
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    static public String reverseWords(String s) {
        String newStr = "";
        StringTokenizer token = new StringTokenizer(s," ");
        while(token.hasMoreTokens()){
            StringBuilder builder =new StringBuilder(token.nextToken());
            builder.reverse();
            newStr+=builder+" ";
        }
        return newStr.trim();
    }
}
