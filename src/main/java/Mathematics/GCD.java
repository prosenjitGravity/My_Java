package Mathematics;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter teh 2 number : ");
        int n1=predator.nextInt();
        int n2=predator.nextInt();
        System.out.println(getgcd(n1,n2));

    }
    static int getgcd(int a,int b){
        int remainder=a%b;
        if(remainder==0){
            return b;
        }
        return getgcd(b,remainder);
    }
}
