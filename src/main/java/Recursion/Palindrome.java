package Recursion;

import java.util.Scanner;

public class Palindrome {
    static int sum=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number here : ");
        int number=sc.nextInt();
         isPalindrome(number);
        if(number==sum){
            System.out.println("The number "+number+" is Palindrome");
        }else{
            System.out.println("The number "+number+" is Not Palindrome");
        }
    }
    static void isPalindrome(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        isPalindrome(n/10);
    }
}
