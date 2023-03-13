package String_Handling;

public class GetChar {
    public static void main(String[] args){
        String s="this is a demo of  the getChars method";
        char[] chars=new char[15-5];
        s.getChars(5,15,chars,0);
        System.out.println(chars);
    }
}
