package Cmd;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("enter the number : ");
        int number=predator.nextInt();
        int n=number;
        int sum=0;
        while(number!=0){
            int remainder=number%10;
            sum=sum*10+remainder;
            number=number/10;
        }
        System.out.println(sum);
    }
}
