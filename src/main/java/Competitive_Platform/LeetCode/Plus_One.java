package Competitive_Platform.LeetCode;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
        plusOne(new int[]{9});
    }
    static public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
