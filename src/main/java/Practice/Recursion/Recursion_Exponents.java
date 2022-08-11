package Practice.Recursion;

import java.util.Scanner;

public class Recursion_Exponents {
    public static void main(String[] args){
        Scanner predator= new Scanner(System.in);
        System.out.println("enter base and exponents : ");
        int base=predator.nextInt();
        int exp=predator.nextInt();
        System.out.println(power(base,exp));
    }
    static int power(int x,int y){
        if(y==0){
            return 1;
        }else{
            return x*power(x,y-1);
        }
    }
}
