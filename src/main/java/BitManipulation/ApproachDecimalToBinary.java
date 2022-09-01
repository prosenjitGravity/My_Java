package BitManipulation;
import java.util.Scanner;
public class ApproachDecimalToBinary {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("enter the decimal value : ");
        int decimal=predator.nextInt();
        int binary=0,i=1;
        while(decimal>0){
            int remainder=decimal%2;
            decimal=decimal/2;
            binary+=remainder*i;
            i*=10;
        }
        System.out.println(binary);
    }

}
