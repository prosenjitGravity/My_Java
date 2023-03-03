package Competitive_Platform.InterviewBit;

import java.math.BigInteger;

public class MultiplyString {
    public static String multiply(String A, String B) {
        BigInteger a=new BigInteger(A);
        BigInteger b=new BigInteger(B);
        return String.valueOf(a.multiply(b));
    }

    public static void main(String[] args) {
        System.out.println(multiply("9999999999","2"));
    }
}
