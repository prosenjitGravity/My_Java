package Java_Features.Java_Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputType {
    public static void main(String[] java) throws IOException {
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer value :  ");
        int data= Integer.parseInt(predator.readLine());
        System.out.println("You have entered : "+data);
    }
}
