package Competitive_Platform.LeetCode.Easy;

public class Merge_Strings_Alternately {
    public static void main(String[] args){

        System.out.println(mergeAlternately("ab","pqrs"));
    }
    static public String mergeAlternately(String word1, String word2) {
        StringBuilder sBuilder=new StringBuilder("");
        int totalLength=word1.length()+word2.length();
        for(int i=0;i<totalLength;i++) {
            if (i < word1.length()) {
                sBuilder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sBuilder.append(word2.charAt(i));
            }
        }
        System.out.println("the new String is : "+sBuilder);
        return sBuilder.toString();
    }
}
