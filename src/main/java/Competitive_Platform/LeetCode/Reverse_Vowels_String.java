package Competitive_Platform.LeetCode;

import java.util.Scanner;

/*
* Input: s = "hello"
  Output: "holle"
  *
  * Input: s = "leetcode"
  Output: "leotcede"
  *
* */
public class Reverse_Vowels_String {    //# question no : 345
    public static void main(String[] args){
        System.out.println("enter the String : ");
        Scanner predator=new Scanner(System.in);

    }
    public static String reverseVowels(String s) {
        int start=0, end=s.length();
        char[] vow=new char[256];
        while(start<end){
            while(start<end && vow[s.charAt(start)]==0){
                start++;
            }
            while(start<end && vow[s.charAt(end)]==0){
                end--;
            }
        }
        return s;
    }
}
