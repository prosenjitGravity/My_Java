package Java_In_My_Way.Challenge;

import java.util.ArrayList;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] create = getArray();
        println(create);
        spiral(create);
    }
    /*
                                                                         1 -> 2 -> 3 ->  4    00 01 02 03
                                                                                         |    10 11 13 14
                                                                         5 ->  6 -> 7    8    20 21 22 23
                                                                         |          |    |    30 31 32 33
                                                                         9   10 <- 11   12
                                                                         |               |
                                                                        13 <- 14 <- 15 <-16

                                                                       */
    static void spiral(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int top = 0, left = 0, right = matrix.length - 1, bottom = matrix.length - 1;
        // row left to write
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) { // left to right
                list.add(matrix[left][i]);
                System.out.println(list);
            }
            top++;

            for (int i = top; i <=bottom; i++) { // top to bottom
                list.add(matrix[i][bottom]);
                System.out.println(list);
            }
            right--;
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
                System.out.println(list);
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
                System.out.println(list);
            }
            left++;
        }
    }


    static int[][] getArray() {
        return new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},};
    }

    static void println(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
