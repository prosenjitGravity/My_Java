package Competitive_Platform.Java_In_My_Way.Interview_Practice;
import java.util.Scanner;
public class Swap {
    static  Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the 1st value : ");
        int a=predator.nextInt();
        System.out.println("enter the 2nd value : ");
        int b=predator.nextInt();
        System.out.println("pricess1");
        swapping(a,b);
        System.out.println("pricess2");
        swapping2(a,b);
        System.out.println("pricess3");
        swapping3(a,b);

    }
    static void swapping(int a,int b){
        System.out.println("before swapping the value is  : a = "+a+" & b = "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping the value is  : a = "+a+" & b = "+b);
    }
    //        without using 3rd variable
    static void swapping2(int a,int b){
        System.out.println("before swapping the value is  : a = "+a+" & b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping the value is  : a = "+a+" & b = "+b);
    }
    //        swap two number using bitwise operator
    static void swapping3(int a,int b){
        System.out.println("before swapping the value is  : a = "+a+" & b = "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping the value is  : a = "+a+" & b = "+b);
    }
}
