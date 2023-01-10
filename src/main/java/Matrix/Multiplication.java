package Matrix;

import java.util.Scanner;

public class Multiplication {
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("how many row you want");
        int row = predator.nextInt();
        System.out.println("how many row you want");
        int col = predator.nextInt();
        System.out.println("\nCreate first matrix");
        int[][] first = getMatrix_element(row, col);
        System.out.println("\nCreate second matrix");
        int[][] second = getMatrix_element(row, col);
        System.out.println("Monitoring  Two matrices");
        System.out.println("\nfirst");
        println(first);
        System.out.println("\n second");
        println(second);
        System.out.println("Monitoring two array  multiplication");
        println(multiply(first, second));
    }

    static int[][] getMatrix_element(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("enter " + i + j + " th element");
                matrix[i][j] = predator.nextInt();
            }
        }
        return matrix;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] multi = new int[a.length][b.length];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                multi[i][j] = 0;
                for (int k = 0; k < multi.length; k++) {
                    multi[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return multi;
    }

    static void println(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
