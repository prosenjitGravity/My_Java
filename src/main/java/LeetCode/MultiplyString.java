package LeetCode;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyString {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println(multiply(predator.nextLine(),predator.nextLine()));

    }
    static String multiply(String s1, String s2){
        BigInteger v1=new BigInteger(s1);
        BigInteger v2=new BigInteger(s2);
        String result;
        return result=v1.multiply(v2).toString();
    }
}
//"123456789"
//        "987654321"