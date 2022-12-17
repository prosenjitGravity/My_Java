package Aptitude.QTA;

import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the String :");
        String data=predator.nextLine();
        char[] ch=data.toCharArray();
        String newdata="";
        for (int i=0;i<ch.length;i++){
            newdata+=ch[ch.length-i-1];
        }
        System.out.println(newdata);
    }
}
