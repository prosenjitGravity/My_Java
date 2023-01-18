package Competitive_Platform.LeetCode;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    static public int lengthOfLastWord(String s) {
        int l=0;
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i== arr.length-1){
                l=arr[i].length();
            }
        }
        return l;
    }
}
