package Competitive_Platform.LeetCode;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args){
        int arr[][]=getArr();
        System.out.println("Before sorting matrix is : ");
        println(getArr());
        System.out.println("Rotate 90 degree Clock wise");
        println(Rotation(getArr()));
    }
    public static void println(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] Rotation(int[][] matrix){
        int[][] rotate=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                rotate[j][matrix.length-i-1]=matrix[i][j];
            }
        }
        return rotate;
    }
    static int[][] getArr(){
        return new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
}
