package Competitive_Platform.CodeForces;//package CodeForces;
import java.util.Scanner;
public class Sum {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args) {
        int t=predator.nextInt();
        while(t-->0){
            System.out.println(isTrue());
        }
    }
    static  String isTrue(){
        int a=predator.nextInt();
        int b=predator.nextInt();
        int c=predator.nextInt();
        return ((a+c)==b)?"Yes":"No";
    }
}
