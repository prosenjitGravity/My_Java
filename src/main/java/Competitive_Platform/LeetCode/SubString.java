package Competitive_Platform.LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {
    public static void main(String[] args) throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the  String : ");
        System.out.println(HowManySubStrings(predator.readLine()));
    }
    static int HowManySubStrings(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            String s="";
            for(int j=i;j<str.length();j++){
                s+=str.charAt(j);
                System.out.println(s);
                count++;
            }
        }
        return count;
    }
}
