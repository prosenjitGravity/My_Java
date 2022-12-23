package Competitive_Platform.LeetCode;
import java.util.Scanner;
public class AddString {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("first String Integer value : ");
        String  value1=predator.nextLine();
        System.out.println("second String Integer value : ");
        String value2=predator.nextLine();
        System.out.println(Addition(value1,value2));
    }
    static String Addition(String str1,String str2){
        int a=Integer.parseInt(str1)+Integer.parseInt(str2);
        String v= String.valueOf(a);
        return v;
    }
}
