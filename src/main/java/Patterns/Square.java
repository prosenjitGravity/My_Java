package Patterns;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Square {
    public static void main(String[] args)throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose the row and column : ");
        int n=Integer.parseInt(predator.readLine());
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
