package OrganizationS_Zone.org.example;
import java.util.Scanner;
public class fibonacci {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("print the series");
        for(int i=0;i<arr.length;i++){
            getSeries(arr[i]);
        }
        for(int i=0;i<=17;i++){
            System.out.println(i+" "+getPrime(i));
        }
        System.out.println();
    }
    static void getSeries(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
    static boolean getPrime(int n){
        if(n<=1){
            return false;
        }else{
            int c=2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;
            }
        }
        return true;
    }
}
