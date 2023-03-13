package Competitive_Platform.HackerRank;
import java.util.Scanner;
public class Valid_UseName {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int n=predator.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter username : ");
            String uname=predator.nextLine();
        }
    }
    static void checkValidity(String username){
        if(username.length()<=8){
            System.out.println("Invalid");
        }
    }
}
