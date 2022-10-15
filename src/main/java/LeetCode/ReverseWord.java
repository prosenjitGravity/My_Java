package LeetCode;

public class ReverseWord {
    public static void main(String[] args){
        System.out.println(reverseWord("God Ding"));
    }
    static String reverseWord(String s){
        String data="";
        for(String i:s.split(" ")){
            StringBuffer buffer=new StringBuffer(i);
            data+=buffer.reverse().toString()+" ";
        }
        return data.trim();
    }
}
