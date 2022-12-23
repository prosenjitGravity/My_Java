package Competitive_Platform.CodeChef;

import java.util.Scanner;

public class SaleSeason {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int t=predator.nextInt();
        while(t-->0){
            int x=predator.nextInt();
            if(x<=100){
                System.out.println(x);
            }else if(x<=1000){
                System.out.println((x-25));
            } else if (100<x && x<=5000) {
                System.out.println((x-100));
            }else{
                System.out.println((x-500));
            }
        }
    }
}
