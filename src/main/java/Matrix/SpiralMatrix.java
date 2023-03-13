package Matrix;

import java.util.Scanner;

public class SpiralMatrix {
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("how many row you want : ");
        int row = predator.nextInt();
        System.out.println("how many column you want : ");
        int col = predator.nextInt();
        int spiral[][] = new int[row][col];
        System.out.println("enter the " + row * col + " value : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter the value of  : " + i + j);
                spiral[i][j] = predator.nextInt();
            }
        }
        Monitoring(spiral);
        System.out.println();
        spiral(spiral, row, col);
    }

    static void spiral(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int start = 0;
        while (start < (r * c)) {
            for (int i = leftCol; i <= rightCol && start < (r * c); i++) { //
                System.out.print(matrix[topRow][i] + " ");
                start++;
            }
            topRow++;
            System.out.print("\t");
            for (int j = topRow; j <= bottomRow && start < (r * c); j++) {
                System.out.print(matrix[j][rightCol] + " ");
                start++;
            }
            rightCol--;
            System.out.print("\t");
            for (int k = rightCol; k >= leftCol && start < (r * c); k--) {
                System.out.print(matrix[bottomRow][k] + " ");
                start++;
            }
            bottomRow--;
            System.out.print("\t");
            for (int l = bottomRow; l >= topRow && start < (r * c); l--) {
                System.out.print(matrix[l][leftCol] + " ");
                start++;
            }
            leftCol++;
        }
    }

    static void Monitoring(int arr[][]) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
