package Competitive_Platform.LeetCode;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(plusOne(new int[]{4,3,2,1})));
    }
    static public int[] plusOne(int[] digits) {
        for(int i=0;i<digits.length;i++){
            if (i==digits.length-1){
                digits[i]=digits[i]+1;
            }
        }
        return digits;
    }
}
