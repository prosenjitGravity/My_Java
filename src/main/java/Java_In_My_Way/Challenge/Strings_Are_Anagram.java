package Java_In_My_Way.Challenge;

public class Strings_Are_Anagram {
    public static void main(String[] java){
        System.out.println(isAnagram("listen","silent"));
    }
    static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

         for(int i=0;i<s1.length();i++){
             if(s1.charAt(i)==s2.charAt(i)){
                 System.out.println(s1.charAt(i)+" == "+s2.charAt(i));
             }
         }

        return false;
    }
    static void sorting(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length-i-1;j++){
                if(ch[j]>ch[j+1]){
                    char c=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=c;
                }
            }
        }
    }
    static void println(String arr){
        for(int i=0;i<arr.length();i++){
            System.out.println(arr.charAt(i));
        }
    }
}
