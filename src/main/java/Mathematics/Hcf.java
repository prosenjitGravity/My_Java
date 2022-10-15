package Mathematics;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1=predator.nextInt();
        System.out.println("Enter the second number : ");
        int n2=predator.nextInt();
        for(int i=1;i<n1||i<n2;i++){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
            }
        }
    }
}
