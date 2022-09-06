package Exception_Handling;

import java.util.Scanner;

public class StringException {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String data = predator.nextLine();
        try {
            System.out.println("Enter the location : ");
            int l = predator.nextInt();
            System.out.println(data.charAt(l)+" is found in location  : "+l);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Something went wrong  : " + e);
        }
    }
}
