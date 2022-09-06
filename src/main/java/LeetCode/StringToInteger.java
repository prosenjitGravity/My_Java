package LeetCode;

public class StringToInteger {
    public static void main(String[] args){
       System.out.println( toInteger("-42"));
    }
    static int toInteger(String data){
        int ascii=0;
        for(int i=0;i<data.length();i++){
            ascii=Integer.parseInt(String.valueOf(data.charAt(i)));
        }
        return ascii;
    }
}
