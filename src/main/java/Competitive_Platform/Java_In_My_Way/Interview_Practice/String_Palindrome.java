package Competitive_Platform.Java_In_My_Way.Interview_Practice;
import java.util.Scanner;
public class String_Palindrome {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the String");
        String data=predator.nextLine();
        System.out.println(isPalindrome(data));

    }
    static boolean isPalindrome(String data){
        for(int i=0;i<data.length()/2;i++){
            if(data.charAt(i)!=data.charAt(data.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
