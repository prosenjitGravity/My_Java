package Competitive_Platform.LeetCode.Medium;
/*
* You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:

If the character read is a letter, that letter is written onto the tape.
If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
Given an integer k, return the kth letter (1-indexed) in the decoded string.



Example 1:

Input: s = "leet2code3", k = 10
Output: "o"
Explanation: The decoded string is "leet leet code leetleetcode leetleetcode ".
The 10th letter in the string is "o".
Example 2:

Input: s = "ha22", k = 5
Output: "h"
Explanation: The decoded string is "hahahaha".
The 5th letter is "h".
Example 3:

Input: s = "a2345678999999999999999", k = 1
Output: "a"
Explanation: The decoded string is "a" repeated 8301530446056247680 times.
The 1st letter is "a".*/

import java.util.StringTokenizer;

public class Decoded_String_at_Index {
    public static  void main(String[] args){
        decode("leet2code3");

    }
//    static public String decodeAtIndex(String s, int k) {
//
//    }
    static void decode(String str){
        StringBuilder builder = new StringBuilder();
        String  data ="";
        int size =0;

        for(char  ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                size =Character.getNumericValue(ch);
                for(int i=0;i<size;i++){
//                    builder.append(data);

                }
                data+=data;

            }else{
                data+=ch;
            }
        }
        System.out.println(data);

    }
}
