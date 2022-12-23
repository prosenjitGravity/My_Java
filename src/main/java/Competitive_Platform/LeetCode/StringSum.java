package Competitive_Platform.LeetCode;

public class StringSum {
    public static void main(String[] args){
        addition("21","20");
    }
    static void addition(String s1,String s2){
        Long x=Long.parseLong(s1);
        Long y=Long.parseLong(s2);
        String res= String.valueOf(x+y);
        System.out.println(res);
    }
}
