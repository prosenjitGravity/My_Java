package Competitive_Platform.LeetCode;
import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=predator.nextInt();
        int n1=number;
        int temp=n1;
        int count=0;
        while(number>0){
            count++;
            number/=10;
        }
        System.out.println(""+count);
        int sum=0;
        while(n1!=0){
            int rem=n1%10;
            sum=sum+(int)(Math.pow(rem,count));
            n1/=10;
        }
        if(sum==temp){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
