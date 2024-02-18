package Matrix;

import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args) {
//        Scanner predator=new Scanner(System.in);
//        System.out.println("Enter the matrix size : ");
//        int n=predator.nextInt();
//        int[][] arr=new int[n][n];
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length;j++){
//                System.out.println("Enter the "+i+""+j+" value");
//                arr[i][j]=predator.nextInt();
//            }
//        }
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
////        System.out.println(arr[0].length);

        displayMD_array(Transpose(getMatrix()));
    }

    static int[][] getMatrix() {
        return new int[][]{
                           {1,2,3},
                           {4,5,6},
                           {7,8,9}
                          };
    }

    static int[][] Transpose(int matrix[][]) {
        int[][] m= new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j =0; j < matrix.length; j++) {
                m[i][j] = matrix[j][i];   // 00=00,01=10,02=20
            }
        }
        return matrix;
    }

    static void displayMD_array(int[][] md_arr) {
        for (int i = 0; i < md_arr.length; i++) {
            for (int j = 0; j < md_arr[i].length; j++) {
                System.out.print(md_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
