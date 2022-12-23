package Competitive_Platform.CodeForces;
import java.util.Scanner;
public class Factorial_Divisibility {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many Integer you want : ");
        int x=predator.nextInt();
        System.out.println("enter the  ka value : ");
        int k=predator.nextInt();
        int[] arr=new int[x];
        for(int i=0;i<arr.length;i++){
            System.out.print("insert the "+(i+1)+" value : ");
            arr[i]=predator.nextInt();
        }
        System.out.println("Monitoring Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=factorial(arr[i]);
        }
        System.out.println("\nThe sum of factorial is  : "+sum);
        System.out.println(isTrue(sum,factorial(k)));
    }
    static boolean isTrue(int a,int b){
        if(a%b==0){
            return true;
        }else{
            return false;
        }
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }
}
