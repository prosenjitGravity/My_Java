package Competitive_Platform.LeetCode.Medium;

import java.util.Arrays;

public class Kth_Smallest_Element_in_a_Sorted_Matrix {
    public static void main(String[] args){
        System.out.println(kthSmallest(new int[][]{{-5}},1));
    }
    static public int kthSmallest(int[][] matrix, int k) {
        System.out.println(matrix.length);
        int arr[]=new int[matrix.length*matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[i*matrix.length+j]=matrix[i][j];
            }
        }
        System.out.println(arr.length);
        Arrays.sort(arr);
        return arr[k-1];
    }
}
