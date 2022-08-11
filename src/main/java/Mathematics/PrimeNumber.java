package Mathematics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=predator.nextInt();
        for (int i=1;i<number;i++){
            System.out.println(i+" :: "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
