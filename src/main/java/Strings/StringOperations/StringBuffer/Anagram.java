package Strings.StringOperations.StringBuffer;

import java.util.Arrays;

public class Anagram {
    public static void main(String [] args){
        System.out.println(isAnagram("silent","listen"));
    }
//    static boolean isAnagram(String str1,String str2){
//        boolean visited[]=new boolean[str1.length()];
//        if(str1.length()!=str2.length()){
//            return false;
//        }
//        boolean isTrue;
//        for(int i=0;i<str1.length();i++){
//            isTrue=false;
//            for(int j=0;j<str2.length();j++){
//                if(str1.charAt(i)==str2.charAt(j)&& !visited[j]){
//                    visited[j]=true;
//                    isTrue=true;
//                    break;
//                }
//            }
//            if(!isTrue){
//                break;
//            }
//        }
//        return true;
//    }
    static  boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        Arrays.sort(new String[]{str1});
        Arrays.sort(new String[]{str2});
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}