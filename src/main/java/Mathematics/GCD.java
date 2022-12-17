package Mathematics;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the 2 number : ");
        int n1=predator.nextInt();
        int n2=predator.nextInt();
        System.out.println(getGcd(n1,n2));

    }
    static int getGcd(int a,int b){
        int remainder=a%b;
        if(remainder==0){
            System.out.println("remainder : "+remainder);
            return b;
        }
        return getGcd(b,remainder);
    }
}
