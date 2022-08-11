package Mathematics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int remainder=n%10;
            sum= sum*10+remainder;
            n=n/10;
        }
        System.out.println(sum);
    }
}
