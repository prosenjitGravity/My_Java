package Mathematics;

import java.util.Scanner;

public class BaseExponents {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the base");
        int base =predator.nextInt();
        System.out.println("Enter the exponent : ");
        int exponent=predator.nextInt();
        int result=1;
        int i=1;
        while(exponent>0){
            result*=base;
            System.out.println(base+"^"+i+" = "+result);
            i++;
            exponent--;
        }
        System.out.println(result);
    }
}
