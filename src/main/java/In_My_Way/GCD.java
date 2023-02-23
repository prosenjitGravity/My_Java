package In_My_Way;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int x=predator.nextInt();
        System.out.println("enter 2nd number : ");
        int y=predator.nextInt();
        System.out.println(commonFactor(x,y));
        System.out.println(euclidGcd(x,y));
        System.out.println(euclid(x,y));
    }
    static int euclidGcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
    static int  commonFactor(int a,int b){
        int min=0,common=0;
        if(a<b){
            min=a;
        }else{
            min=b;
        }
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    static int euclid(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a!=0){
            return a;
        }else{
            return b;
        }
    }
}
