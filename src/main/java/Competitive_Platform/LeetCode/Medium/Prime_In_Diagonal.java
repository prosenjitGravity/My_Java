package Competitive_Platform.LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prime_In_Diagonal {
    //    static public int diagonalPrime(int[][] nums) {
//        int hmax=0;
//        int max=0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                if(i==j){
//                    if(max<nums[i][j]){
//                        max=nums[i][j];
//                    }
////                    System.out.println(nums[i][j]);
//                } else if (j== nums.length-i-1) {
//                    if(max<nums[i][j]){
//                        max=nums[i][j];
//                    }
////                    System.out.println(nums[i][j]);
//                }
//            }
//           hmax=max;
//        }
//        System.out.println("Highest Max is  : "+hmax);
//        return hmax;
//    }
    // process 2
    static public int diagonalPrime(int[][] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i][i]);
            arr.add(nums[i][nums.length - i - 1]);
        }
        Collections.sort(arr, Collections.reverseOrder());
        ;
//        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            if (isPrime(arr.get(i)) == true) {
                return arr.get(i);
            }
        }
        return 0;
    }

    static int[][] getMatrix() {
        return new int[][]{{1, 2, 3}, {5, 17, 7}, {9, 11, 10}};
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(diagonalPrime(getMatrix()));
    }
}
