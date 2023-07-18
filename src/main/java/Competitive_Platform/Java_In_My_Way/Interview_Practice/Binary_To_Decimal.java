package Competitive_Platform.Java_In_My_Way.Interview_Practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Binary_To_Decimal {
    static BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        System.out.println("enter the binary number : ");
        int binary=Integer.parseInt(predator.readLine());
        System.out.println(decimal(binary));
    }
    public static int decimal(int b){
        int sum=0;int power=0;
        while(b!=0){
            int remainder=b%10;
            sum+=(remainder*Math.pow(2,power++));
            b/=10;
        }
        return sum;
    }
}
