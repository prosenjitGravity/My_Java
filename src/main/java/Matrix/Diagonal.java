package Matrix;

import java.util.Scanner;

public class Diagonal {
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("how many row and column you want :");
        System.out.println("how many row you want");
        int row = predator.nextInt();
        System.out.println("how many column you want");
        int col = predator.nextInt();
        // create matrix and print both in println() function
        int[][] matrices = createMatrix(row, col);
        println(matrices);
        System.out.println("print principal diagonal");
        print_PrincipalDiagonal(matrices);
        System.out.println("print Secondary diagonal");
        print_SecondDiagonal(matrices);
    }

    static int[][] createMatrix(int r, int c) {
        System.out.println("Create " + r + "x" + c + " matrix ");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("enter the " + i + j + "th element");
                matrix[i][j] = predator.nextInt();
            }
        }
        return matrix;
    }

    static void print_PrincipalDiagonal(int[][] m) {
//        // first approach
//        System.out.println("1st approach");
//        for (int i = 0; i < m.length; i++) {
//            System.out.print(m[i][i] + " ");
//        }
//        System.out.println("2nd approach");
        // Second approach
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    System.out.print(m[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    static void print_SecondDiagonal(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if ((i + j) == (n.length - 1))
                    System.out.print(n[i][j] + " ");
            }
        }
    }

    static void println(int[][] arr) {
        System.out.println("Matrix is created");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
