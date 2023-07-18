package Competitive_Platform.Java_In_My_Way;

import java.util.Scanner;

public class Number_power_of_2 {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the value  : ");
        int num=predator.nextInt();
        System.out.println(checkPower(num));
        checkPower(num);
    }

    /*
    * suppose n=16
    * n & (n-1);
    * 16 & (16-1)
    * 16 & 15
    * 16 binary is : 10000
    * 15 binary is : 01111
    * ---------------------
    *                00000
    *
    * */
    static boolean checkPower(int n){
        if(n==0){
            return false;
        }
        return (n&(n-1))==0;
    }
}
