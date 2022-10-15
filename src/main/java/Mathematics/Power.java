package Mathematics;

import java.util.Scanner;

import static java.lang.System.out;

public class Power {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the base and Exponents");
        int base=predator.nextInt();
        int exponent=predator.nextInt();
        int powerIs=findPower(base,exponent);
//        out.println(findPower(base,exponent));
    }
    static int findPower(int x,int y){
        if(y==0){
            return 1;
        }
        else{
            return (x*findPower(x,y-1));
        }
    }

}
