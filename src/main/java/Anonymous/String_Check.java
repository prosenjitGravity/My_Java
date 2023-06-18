package Anonymous;

public class String_Check {
    public static void main(String[] args){
        String s1=new String("Einstein");
        String s2="Einstein";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String example = new String("InterviewBit");
        example = null;
        System.gc(); // Garbage collector called
    }

}
