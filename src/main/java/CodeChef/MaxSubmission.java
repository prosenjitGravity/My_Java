package CodeChef;

import java.util.Scanner;

public class MaxSubmission {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int t=predator.nextInt();
        while(t-->0){
            System.out.println((predator.nextInt()*60)/30);
        }
    }
}
