package Taku_U_Forward.Build_up_Logical_Thinking;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Famous_Pattern {
    public static void main(String[] args)throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        pattern(n);

    }
    static void pattern(int n) throws InterruptedException {
        int row=2*n-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                int r=n-getMin(i,j,row-i-1,row-j-1);
                Thread.sleep(500);
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }
    private static int getMin(int a,int b,int c,int d){
        return Collections.min(Arrays.asList(a,b,c,d));
    }
}
