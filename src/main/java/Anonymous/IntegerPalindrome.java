package Anonymous;
import java.util.Scanner;
public class IntegerPalindrome {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int num=predator.nextInt();
        System.out.println(num+" is Palindrome : "+isPalindrome(num));
    }
    static boolean isPalindrome(int number){
        int n=number;
        int sum=0;
        int remainder;
        while(number!=0){
            remainder=number%10;
            sum=sum*10+remainder;
            number/=10;
        }
        if(n!=sum){
            return false;
        }
        return true;
    }
}
