package Strings.StringOperations.StringTokenizers;
import java.util.Scanner;
public class StringValue {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int n=predator.nextInt();
//        String s= String.valueOf(n);
//        System.out.println(s);
        String s=""+n;
        System.out.println(s+" "+s.getClass().getName());
        if(!s.equals(n)){
            System.out.println("good");
        }else{
            System.out.println("wrong");
        }
    }
}
