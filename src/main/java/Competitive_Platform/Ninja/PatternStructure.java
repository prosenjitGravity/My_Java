package Competitive_Platform.Ninja;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class PatternStructure {
    public static void main(String[] args) throws InterruptedException {
        Scanner predator=new Scanner(System.in);
        System.out.println("How many value you want : ");
        int n=predator.nextInt();
        int r=(n*2)-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                int t=(n-Minimum(i,j,r-i-1,r-j-1));
                System.out.print(" "+t+" ");
//                Thread.sleep(500);
            }
            System.out.println();
        }
    }
    public static int Minimum(int a,int b,int c,int d){
        return Collections.min(Arrays.asList(a,b,c,d));
    }
}
