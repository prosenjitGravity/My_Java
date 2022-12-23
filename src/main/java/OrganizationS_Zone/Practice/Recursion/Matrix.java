package OrganizationS_Zone.Practice.Recursion;

import org.jetbrains.annotations.NotNull;

public class Matrix {
    public static void main(String[] args){
        int array[][]=getArray();
        Recursion(0,0,array);
    }
    static void Recursion( int i,int j,int[][] arr){
        if(i<arr.length){
            if(j<arr.length){
                System.out.print(arr[i][j]+" ");
                Recursion(i,j+1,arr);
            }
            System.out.println();
            Recursion(i+1,j,arr);
        }
    }

    static int[][] getArray(){
        return new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
}
