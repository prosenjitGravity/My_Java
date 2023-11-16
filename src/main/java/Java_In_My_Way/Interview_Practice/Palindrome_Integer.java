package Java_In_My_Way.Interview_Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palindrome_Integer {
    static BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        System.out.println("enter the number : ");
        int n=Integer.parseInt(predator.readLine());
        System.out.println(palindrome(n));
    }

    public static boolean palindrome(int n) {
        int temp=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return temp==rev? true:false;
    }
}
