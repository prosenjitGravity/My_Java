package Aptitude.QTA;

import java.util.Scanner;

public class Reverse_Integer {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the integer data : ");
        int num=predator.nextInt();
        System.out.println(Reverse(num));
    }
    static int Reverse(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum;
    }
}
