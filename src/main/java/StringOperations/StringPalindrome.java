package StringOperations;

public class StringPalindrome {
    public static void main(String[] java){
        System.out.println(palindrome("malayalam"));
    }
    static String palindrome(String info){
        char data[]=info.toCharArray();
        for(int i=0;i<data.length/2;i++){
            if(data[i]!=data[data.length-1-i]){
                return "No";
            }
        }
        return "Yes" ;
    }
}
