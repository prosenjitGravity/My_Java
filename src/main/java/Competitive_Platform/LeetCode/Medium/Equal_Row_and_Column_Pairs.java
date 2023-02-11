package Competitive_Platform.LeetCode.Medium;

import java.util.Arrays;

public class Equal_Row_and_Column_Pairs {
    public static void main(String[] args){
        System.out.println(equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
    }
    static  public int equalPairs(int[][] grid) {
        int arr[][]=new int[grid.length][grid.length];
        int count=0;
        transpose(arr,grid);
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if (Arrays.equals(arr[i],grid[j])){
                    count++;
                }
            }
        }
        return count;
    }
    static void transpose(int a[][],int b[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=b[j][i];
            }
        }
    }
}
