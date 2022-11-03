package Anonymous;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringPalindrome{
    public static void main(String[] args) throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String data : ");
        String str=predator.readLine();
        System.out.println(str+" is Palindrome : "+isPalindrome(str));
    }
    static boolean isPalindrome(String data){
        for(int i=0;i<data.length();i++){
            if(data.charAt(i)!=data.charAt(data.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
