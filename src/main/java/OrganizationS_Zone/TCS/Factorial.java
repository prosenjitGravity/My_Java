package OrganizationS_Zone.TCS;
import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        System.out.println();
        for(int i=0;i<=num;i++){
            System.out.println(i+"! is "+factorial(i));
        }
    }
}
