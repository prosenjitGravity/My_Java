package In_My_Way;

import java.util.Scanner;

public class XXX_pattern {
    public static void main(String [] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=predator.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("print "+i);
            create_pattern((i*2)-1);
        }
       /* int[] n1 = new int[0];
        boolean[] n2 = new boolean[-200];
        double[] n3 = new double[2241423798];//this is an Error
        char[] ch = new char[20];*/
    }
    static void create_pattern(int n){
        int c=0,d=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    if(j<=(n/2)) {
                        System.out.print(++c);
                    }else{
                        System.out.print(--c);
                    }
                }else if(j==n-i-1){
                    if(j>=(n/2)) {
                        System.out.print(++d);
                    }else{
                        System.out.print(d--);
                    }
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
