package OrganizationS_Zone.Practice.Patterns;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("enter the value : ");
        int value=predator.nextInt();
        for(int i=0;i<value;i++){
            for (int j=0;j<value;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
