package Matrix;

import java.util.Scanner;

public class Snake_Matrix {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] java){
        System.out.println("Original Matrix");
//        println(dynamic_element());
        println(getMatrix());
        System.out.println("Create snake matrix vertically\n");
        Snake_Vertically(getMatrix());
//        Snake_Vertically(dynamic_element());
        System.out.println("Create snake matrix Horizontally\n");
        Snake_Horizontally(getMatrix());
//        Snake_Horizontally(dynamic_element());
    }
//    static int[][] dynamic_element(){
//        System.out.println("how many row you want");
//        int row=predator.nextInt();
//        System.out.println("how many column you want");
//        int col=predator.nextInt();
//        int[][] matrix=new int[row][col];
//        for(int i=0;i< matrix.length;i++){
//            for(int j=0;j<matrix.length;j++){
//                System.out.println("enter the "+i+j+" values : ");
//                matrix[i][j]=predator.nextInt();
//            }
//        }
//        return matrix;
//    }
    static int[][] getMatrix(){
        return new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    }
    static void println(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Snake_Vertically(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i%2==0){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print(matrix[i][matrix.length-j-1]+" ");
                }
            }
            System.out.println("");
        }
    }
    static void Snake_Horizontally(int[][] matrices){
        for(int i=0;i<matrices.length;i++){
            for(int j=0;j<matrices.length;j++){
                if(i%2==0){
                    System.out.print(matrices[j][i]+" ");
                }else{
                    System.out.print(matrices[matrices.length-j-1][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
