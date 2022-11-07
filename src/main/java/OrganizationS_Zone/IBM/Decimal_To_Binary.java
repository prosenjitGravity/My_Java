package OrganizationS_Zone.IBM;

import java.util.Scanner;
public class Decimal_To_Binary {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the decimal number : ");
        int n=predator.nextInt();
        int temp=n;
        int bin=0, i=1;
        while(n!=0){
            int remainder=n%2;
            n/=2;
            bin+=remainder*i;
            i*=10;
        }
        System.out.println(temp+" binary is  : "+bin);
    }
}
