package Competitive_Platform.LeetCode;

public class ReverseString {

    public static void main(String[] args){
        System.out.println(Reverse("abcdefg",2));
    }
    static String Reverse(String s,int k){                 // input = abcdefg  k=2 then output =bacdefg
        String add="";
        String data="";
        String reverse="";
        for (int i=0;i<s.length();i++){
            if(i<2){
                reverse+=s.charAt(i);
            }else{
                data+=s.charAt(i);
            }
        }
        StringBuffer buffer=new StringBuffer(reverse);
        buffer.reverse();
        add=buffer+data;
        return add;
    }
}
