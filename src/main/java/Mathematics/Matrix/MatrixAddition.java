package Mathematics.Matrix;
import java.util.Scanner;
public class MatrixAddition {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        int[] arr1 []=getMatrix1();
        int arr2[][]=getMatrix2();
        System.out.println("first matrix");
        Monitoring(arr1);
        System.out.println("second matrix");
        Monitoring(arr2);
        System.out.println("the  Two matrix Addition is  : ");
        Monitoring(matrixAddition(arr1,arr2));
    }
    static void Monitoring(int display[][]) {    // monitoring matrix
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display.length; j++) {
                System.out.print(display[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[] getMatrix1()[] {
        int arr1[][] = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("enter " + i + j + " value : ");
                arr1[i][j] = predator.nextInt();
            }
        }
        return arr1;
    }

    static int getMatrix2()[][] {
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.println("enter " + i + j + " value : ");
                arr2[i][j] = predator.nextInt();
            }
        }
        return arr2;
    }
    static int[][] matrixAddition(int arr1[][],int arr2[][]){
        int add[][]=new int [arr1.length][arr2.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return add;
    }
}

