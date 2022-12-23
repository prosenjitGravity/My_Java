package Strings.StringOperations.StringTokenizers.SubArray;

public class String_Uppercase1 {
    public static void main(String[] args){
        String s="Helloworld";
        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1));
        System.out.println(s.substring(3,7));
        isPalindrome("Hello");

    }
    static void isPalindrome(String s){
        String p="";
        for(int i=0;i<s.length();i++){
            p+=s.charAt(s.length()-1-i);
        }
        if(s.equals(p)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
