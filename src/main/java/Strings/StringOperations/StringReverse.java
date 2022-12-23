package Strings.StringOperations;
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args){
        System.out.println("Enter the data : ");
        Scanner predator=new Scanner(System.in);
        String data=predator.nextLine();
        for(int i=data.length()-1;i>=0;i--){
            System.out.print(data.charAt(i));
        }
    }
}
