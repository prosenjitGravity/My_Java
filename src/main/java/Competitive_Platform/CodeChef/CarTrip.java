package Competitive_Platform.CodeChef;
import java.util.Scanner;
public class CarTrip {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int t=predator.nextInt();
        while(t-->0){
            int kms=predator.nextInt();
            int result=kms>300?(kms*10):3000;
            System.out.println(result);
        }
    }
}
