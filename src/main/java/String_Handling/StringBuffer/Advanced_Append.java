package String_Handling.StringBuffer;

public class Advanced_Append {
    public static void main(String[] args){
        String s="";
        int a=42;
        StringBuffer buffer=new StringBuffer(40);
        s=buffer.append("a= ").append(a).append("!").toString();
        System.out.println(a);
    }
}
