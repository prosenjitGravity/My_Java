package Competitive_Platform.Java_In_My_Way.Interview_Practice;
import java.util.Scanner;
public class Prime_number {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the number : ");
        int number=predator.nextInt();
        System.out.println("process1....");
        System.out.println(isPrime(number));
        System.out.println("process2....");
        System.out.println(isTrue(number));
    }
    static boolean isPrime(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
            }
        }
        return flag==0? true:false;
    }
    static boolean isTrue(int n){
        int c=2;
        if(n<=1){
            return false;
        }
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
