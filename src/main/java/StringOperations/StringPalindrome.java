package StringOperations;

public class StringPalindrome {
    public static void main(String[] java) {
        System.out.println(isPalindrome("malayalam"));
    }
    static boolean isPalindrome(String data){
        return isTrue(0,data.length()-1,data);
    }
    static boolean isTrue(int i,int j,String s){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isTrue(i+1,j-1,s);
    }

}
