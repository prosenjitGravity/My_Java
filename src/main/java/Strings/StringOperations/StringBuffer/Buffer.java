package Strings.StringOperations.StringBuffer;

public class Buffer {
    public static void main(String[] args){
        StringBuffer b=new StringBuffer("Hello");
        b.append("java");
        System.out.println(b);
        b.insert(0,"hey");
        System.out.println(b);
        System.out.println(b.capacity());
    }
}
