package String_Handling;

public class MakeString {
    public static void main(String[] args) {
        char chars[] = {'J', 'a', 'v', 'a', 'S', 't', 'r', 'i', 'n', 'g', 'H', 'a', 'n', 'd', 'l', 'i', 'n', 'g'};
        String s=new String(chars,2,5);
        System.out.println("the string is  : "+s);
        byte[] bytes=new byte[]{65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};
        String str=new String(bytes);
        System.out.println("the bytes are : "+str);
    }
}
