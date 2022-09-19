package StringTokenizers;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "malaayaalam";
       if( CheckPalindrome(s) && isPalindrome(s)){
           System.out.println("Yes palindrome");
       }else{
           System.out.println("Not Palindrome");
       }
    }
    public static boolean CheckPalindrome(String data) {
        char[] array = data.toCharArray();
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String data){
        int b=0,e=data.length()-1;
        while(b<e){
            if(data.charAt(b)!=data.charAt(e)){
                return false;
            }
            b++;
            e--;
        }
        return true;
    }
}
