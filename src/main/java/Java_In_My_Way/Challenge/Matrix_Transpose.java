package Java_In_My_Way.Challenge;

import java.util.Scanner;

public class Matrix_Transpose {
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the row number : ");
        int r = predator.nextInt();
        System.out.println("enter the col number : ");
        int c = predator.nextInt();
//        displayTranspose(createMatrix(r, c),r,c);
        System.out.println("display");
        display(createMatrix(r, c),r,c);

    }

    static int[][] createMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter the "+i+""+j+"th value : ");
                matrix[i][j] = predator.nextInt();
            }
        }
        return matrix;
    }
    static void display(int[][] arr,int row,int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("");
        }
    }
    static int[][] displayTranspose(int[][] arr,int row,int col) {
        int[][] transpose=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j]=arr[j][i];
            }
        }
        return transpose;
    }
}
