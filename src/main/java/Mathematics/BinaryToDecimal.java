package Mathematics;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number : ");
        int b = sc.nextInt();
        System.out.println(b+" = "+Binary(b));
    }
    static int Binary(int binary){
        int power=0,sum=0;
        while(binary>0){
            int remainder=binary%10;
            sum= (int) (sum+(remainder* Math.pow(2,power++)));
            binary=binary/10;
        }
        return sum;
    }
}
