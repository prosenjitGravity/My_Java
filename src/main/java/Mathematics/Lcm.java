package Mathematics;
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1=predator.nextInt();
        System.out.println("Enter the second number : ");
        int n2=predator.nextInt();
        int lcm=(n1>n2)? n1:n2;
        while(true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.println("The lcm Is  : "+lcm);
                break;
            }
            lcm++;
        }
    }
}
