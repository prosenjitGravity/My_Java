package Mathematics;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args){
        int sum=0,power=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int number=sc.nextInt();
        int o=number;
        while(number>0){
            int remainder=number%10;
            sum=(int)(sum+(remainder*Math.pow(8,power)));
            number=number/10;
            power++;
        }
        System.out.println(o+" : "+sum);
    }
}
