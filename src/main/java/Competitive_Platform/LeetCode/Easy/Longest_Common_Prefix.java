package Competitive_Platform.LeetCode.Easy;

public class Longest_Common_Prefix {

    public static void main(String[] args){
        longestCommonPrefix(new String[]{"flower","flow","flight"});
    }
    public static void longestCommonPrefix(String[] strs) {
        String match_character="";
        String newString="";
        for(int i=0;i<strs.length;i++){
            newString+=strs[i];
        }
        System.out.println(newString);
        for(int i=0;i<newString.length();i++){
            for(int j=0;j<newString.length();j++){
                if(newString.charAt(i)==newString.charAt(j)){

                }
            }
        }
    }
}
