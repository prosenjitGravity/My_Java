package StringTokenizers;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DataSplit {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the String  : ");
        String data=predator.nextLine();
        StringTokenizer st=new StringTokenizer(data,",=.!@#$%^&*()_ +<>?:;[]{}|'");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
