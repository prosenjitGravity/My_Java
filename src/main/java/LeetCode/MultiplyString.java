package LeetCode;

import java.util.Scanner;

public class MultiplyString {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println(multiply(predator.nextLine(),predator.nextLine()));

    }
    static String multiply(String s1,String s2){
        int data=Integer.parseInt(s1)*Integer.parseInt(s2);
        return String.valueOf(data);
    }
}
//"123456789"
//        "987654321"