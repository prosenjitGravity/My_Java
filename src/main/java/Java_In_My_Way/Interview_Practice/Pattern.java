package Java_In_My_Way.Interview_Practice;
import java.util.Scanner;
public class Pattern {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the row and column value");
        int rc=predator.nextInt();
        for(int i=0;i<rc;i++){
            for(int j=0;j<rc;j++){
                if(i==j){
                    System.out.println(" *");
                }else if(j==rc-1-i){
                    System.out.print(" @");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
