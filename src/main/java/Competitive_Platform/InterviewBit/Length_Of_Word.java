package Competitive_Platform.InterviewBit;

/*
* this question is asked by Amazon
* question level is Easy
*  */

public class Length_Of_Word {
    static public int lengthOfLastWord(final String A) {
        String[] s=A.split("\\s+");
        int count=0;
        for(int i=0;i<s.length;i++){
            if(i==s.length-1){
                count=s[i].length();
            }
        }
        return count;
    }
    public static  void main(String[] args){
        System.out.println(lengthOfLastWord("interviewbit"));
    }
}
