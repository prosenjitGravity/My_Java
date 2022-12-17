package Arrays;
import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("How many number you want : ");
        int n=predator.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the "+i+"th number");
             arr[i]=predator.nextInt();
        }
        monitoring(arr);
        System.out.println("\nAfter prefix the array is : \n");
        monitoring(returnPrefix(arr));

    }
    static int[] returnPrefix(int a[]){
        int  prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];

        }
        return prefix;
    }
    static void monitoring(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
