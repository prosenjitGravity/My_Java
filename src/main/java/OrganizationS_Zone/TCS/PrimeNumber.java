package OrganizationS_Zone.TCS;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=predator.nextInt();
        if(isPrime(num)){
            System.out.println("\nThe "+num+" is prime number");
        }else{
            System.out.println("\nThe "+num+" is not prime number");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int s=2;
        while(s*s<=n){
            if(n%s==0){
                return false;
            }
            s++;
        }
        return true;
    }
}
