package Mathematics;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=predator.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println( sum );
    }
}
