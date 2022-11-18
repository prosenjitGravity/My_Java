package Aptitude.QTA;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=predator.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2){
            if(n%i==0){
                System.out.print(i+" ");
                sum=sum+i;
//                System.out.print(sum+" ");
            }
            i++;
        }
        if(sum==n){
            System.out.println("\nthe number is Perfect number");
        }
        else{
            System.out.println("\nImperfect number");
        }
    }
}

