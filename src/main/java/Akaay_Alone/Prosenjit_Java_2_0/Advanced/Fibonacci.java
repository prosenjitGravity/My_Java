package Akaay_Alone.Prosenjit_Java_2_0.Advanced;
import ForEach.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Fibonacci {
    static BufferedReader predator= new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
        System.out.println("Enter the Value : ");
        int num=Integer.parseInt(predator.readLine());
        System.out.println(num +" Fibonacci is  : "+ Arrays.toString(getFibo(num)));
        System.out.println(num+" Tribonacci is  : "+Arrays.toString(getTribo(num)));
    }

    static int[] getFibo(int num){
        int [] fibo = new int[num];
        int a=0,b=1,c=0;
        for(int i=0;i<num;i++){
            fibo[i]=c;
            a=b;
            b=c;
            c=a+b;
        }
        return fibo;
    }
    static int[] getTribo(int num){
        int tribo[]=new int[num];
        int a=0,b=1,c=1, d=0;
        for(int i=0;i<num;i++){
            tribo[i]=a;
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return tribo;
    }
}
