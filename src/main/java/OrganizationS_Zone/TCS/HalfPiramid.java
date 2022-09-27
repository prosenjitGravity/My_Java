package OrganizationS_Zone.TCS;

import java.util.Scanner;

public class HalfPiramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many row and column you want : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<n;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
