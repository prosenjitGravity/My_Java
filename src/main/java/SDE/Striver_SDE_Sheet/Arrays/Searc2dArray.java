package SDE.Striver_SDE_Sheet.Arrays;

import java.util.Scanner;

public class Searc2dArray {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        int[][] arr = new int[][]{{1,3,5,7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(arr.length);
        System.out.println("Given the target : ");
        int target = predator.nextInt();
        System.out.println(Search(arr, target));
    }

    static boolean Search(int array[][], int t) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (t == array[i][j]) {
//                    System.out.println(t+" === "+array[i][j]);
                    return true;
                }
            }
        }
        return false;
    }
}
