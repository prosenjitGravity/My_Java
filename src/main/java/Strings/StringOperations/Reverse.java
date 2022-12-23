package Strings.StringOperations;

public class Reverse {
    public static void main(String[] args){
        String s="this is an amazing program";
        System.out.println(s);
        StringBuffer buffer=new StringBuffer(s);
        buffer.reverse();
        System.out.println(buffer);
        char[] str=s.toCharArray();
        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }

    }
}
