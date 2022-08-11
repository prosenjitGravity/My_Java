package KeyWord_Java;

public class Equality {
    public static void main(String[] args){
        String str1="Hello";
        String str2=new String(str1);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
    }
}
