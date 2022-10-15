package SDE.Striver_SDE_Sheet;

public class ReverseWay {
    public static void main(String[] args){
       System.out.println( ReverseLetter("Good Hello"));
    }
    static String ReverseLetter(String s){
        String temp="";
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
            StringBuffer buffer=new StringBuffer(str[i]);
            temp+= String.valueOf(buffer.reverse())+" ";
        }
        return temp;
    }
}
