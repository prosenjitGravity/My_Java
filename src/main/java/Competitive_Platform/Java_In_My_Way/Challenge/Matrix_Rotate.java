package Competitive_Platform.Java_In_My_Way.Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix_Rotate {
    static BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[][] mat = Create_Matrix();
        println(mat);
        System.out.println("180 degree Rotating matrix is ");
        rotating_clockwise_180(mat);
        System.out.println("90 degree Rotating matrix is ");
        rotating_clockwise_90(mat);
    }

    static void rotating_clockwise_180(int[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotating_clockwise_90(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    static void println(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] Create_Matrix() throws IOException {
        System.out.println("Enter the row : ");
        int row = Integer.parseInt(predator.readLine());
        System.out.println("Enter the column : ");
        int col = Integer.parseInt(predator.readLine());
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("enter the " + i + ":" + j + " value");
                matrix[i][j] = Integer.parseInt(predator.readLine());
            }
        }
        return matrix;
    }
}
