package Competitive_Platform.LeetCode;
import java.util.Scanner;
public class BinaryTDecimal {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Entre the binary number : ");
        int n=predator.nextInt();
        int power=0;
        int sum=0;
        while(n>0){
            int remainder=n%10;
            sum=sum+remainder*(int)Math.pow(2,power);
            power++;
            n=n/10;
        }
        System.out.println(sum);
    }
}
