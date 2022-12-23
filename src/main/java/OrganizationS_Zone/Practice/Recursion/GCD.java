package OrganizationS_Zone.Practice.Recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner predator=new Scanner(System.in);
        System.out.println("enter 1st number :  ");
        int n1=predator.nextInt();
        System.out.println("enter 2nd number : ");
        int n2=predator.nextInt();
        System.out.println("GCD of "+n1+" & "+n2+" is  "+findGcd(n1,n2));
    }
    static int findGcd(int x,int y){
        int remainder=x%y;
        if(remainder==0){
            return y;
        }else{
            return findGcd(y,remainder);
        }
    }
}
