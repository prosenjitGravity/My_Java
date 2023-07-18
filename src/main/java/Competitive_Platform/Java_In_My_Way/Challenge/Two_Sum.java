package Competitive_Platform.Java_In_My_Way.Challenge;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(checkSum(new int[]{3, 11, 15, 9, 8}, 11)));
    }

    static int[] checkSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if ((num[i] + num[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
