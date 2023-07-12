package Competitive_Platform.LeetCode.Easy;

public class Find_Smallest_Letter_Greater_Than_Target {
    static public char nextGreatestLetter(char[] letters, char target) {
        int start=-0,end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>=letters[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'c'));
    }
}
