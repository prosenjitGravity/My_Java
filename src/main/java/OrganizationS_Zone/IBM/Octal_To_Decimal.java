package OrganizationS_Zone.IBM;

import java.util.Scanner;
public class Octal_To_Decimal {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("enter the octal number : ");
        System.out.println(toDecimal(predator.nextInt()));
    }
    static int  toDecimal(int octal){
        int decimal=0,power=0;
        while(octal!=0){
            int rem=octal%10;
            decimal+=(rem *Math.pow(8,power++));
            octal/=10;
        }
        return decimal;
    }
}
