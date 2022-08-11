package Practice.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("enter the positive value : ");
        int value=predator.nextInt();
        System.out.println(value+"! is : "+factorial(value));
        System.out.println("factorial List : ");
        for (int i=1;i<=value;i++){
            System.out.println(i+"! is : "+factorial(i));
        }
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
