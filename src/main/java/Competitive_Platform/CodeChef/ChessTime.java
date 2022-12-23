package Competitive_Platform.CodeChef;

import java.util.Scanner;

public class ChessTime {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int t=predator.nextInt();
        while(t-->0){
            int n=predator.nextInt();
            System.out.println((n*60)/20);
        }
    }
}
