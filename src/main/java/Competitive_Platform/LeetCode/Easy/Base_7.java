package Competitive_Platform.LeetCode.Easy;

public class Base_7 {
    public static void main(String[] args){
        System.out.println(character(100));
    }
    static public final String character(int num){
        int sum=0;
        while(num!=0){
            int remainder =num%7;
            sum=sum*10+remainder;
            num/=7;
        }
        return String.valueOf(sum);
    }
}
