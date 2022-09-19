package StringOperations.StringBuffer;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=predator.nextLine();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.println(s.charAt(i));// not completed
            }
        }
    }
}
