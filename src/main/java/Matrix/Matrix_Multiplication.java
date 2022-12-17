package Matrix;

import java.util.Scanner;

public class Matrix_Multiplication {
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Monitoring Matrix 1 : ");
        int arr1[][] = getMatrix1();
        Monitoring(arr1);
        System.out.println("Monitoring Matrix 2 : ");
        int arr2[][] = getMatrix2();
        Monitoring(arr2);
        System.out.println("Monitoring  2 matrix Multiplication : ");
        Monitoring(Multiplication(arr1, arr2));
    }

    static void Monitoring(int display[][]) {    // monitoring matrix
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display.length; j++) {
                System.out.print(display[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] getMatrix1() {
        int arr1[][] = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("enter " + i + j + " value : ");
                arr1[i][j] = predator.nextInt();
            }
        }
        return arr1;
    }

    static int[][] getMatrix2() {
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println("enter " + i + j + " value : ");
                arr2[i][j] = predator.nextInt();
            }
        }
        return arr2;
    }

    static int[][] Multiplication(int[][] mat1, int[][] mat2) {
        int multiplication[][] = new int[mat1.length][mat2.length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                multiplication[i][j] = 0;
                for (int l = 0; l < multiplication.length; l++) {
                    multiplication[i][j] += mat1[i][l] * mat2[l][j];
                }
            }
        }
        return multiplication;
    }
}
