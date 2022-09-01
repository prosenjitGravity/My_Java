package StringTokenizers;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        CheckPalindrome(s);
    }
    public static void CheckPalindrome(String data) {
        char[] array = data.toCharArray();
        for (int i = 0; i < array.length/2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                System.out.println("Not Palindrome String : "+false);
                break;
            }
            System.out.println(true);
        }
    }
}
