package BitManipulation;

public class ReverseString {
    public static void main(String[] args){
        reverseString(new char[]{'h','e','l','l','o'});
    }
    static public void reverseString(char[] s) {
        String arr[] = new String[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}
