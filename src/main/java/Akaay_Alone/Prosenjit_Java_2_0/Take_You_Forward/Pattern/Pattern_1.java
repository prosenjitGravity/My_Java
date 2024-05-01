package Akaay_Alone.Prosenjit_Java_2_0.Take_You_Forward.Pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Pattern_1 {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
    static Scanner predator1 = new Scanner(System.in);
    public static void main(String[] args)throws IOException{
        System.out.println("Enter the row value : ");
        int row = Integer.parseInt(predator.readLine());
//        int num= predator1.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
