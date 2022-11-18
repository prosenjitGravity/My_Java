package Aptitude.QTA;
import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int number=predator.nextInt();
        System.out.println(isReverse(number));
        System.out.println(isPerfect(number));
    }
    static int isReverse(int n){
        int sum=0;
        while(n!=0){
            int remainder=n%10;
            sum=sum*10+remainder;
            n/=10;
        }
        return sum;
    }
    static String isPerfect(int n){
        int sum1=0,i=1;
        while(i<=n/2){
            if(n%i==0){
                sum1+=i;
            }
            i++;
        }
        return (n==sum1)?" is Perfect number": "is Not Perfect number";
    }
}
