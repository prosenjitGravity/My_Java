package Dynamic_Programming;

import java.util.Scanner;
public class CREDS {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int t=predator.nextInt();
        while(t-->0){
            int x=predator.nextInt();
            int y=predator.nextInt();
            int z=predator.nextInt();
            System.out.println((4*x)+(2*y)+(0*z));
        }
    }
}
