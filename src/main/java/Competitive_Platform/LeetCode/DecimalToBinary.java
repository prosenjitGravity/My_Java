package Competitive_Platform.LeetCode;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the  Decimal value");
        int decimal=predator.nextInt();
        int i=0;
        int arr[]=new int[32];
        while(decimal>0){
            arr[i]=decimal%2;
                decimal=decimal/2;
                i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]+" ");
        }
    }
}
