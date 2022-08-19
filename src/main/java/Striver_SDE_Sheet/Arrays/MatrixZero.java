package Striver_SDE_Sheet.Arrays;

public class MatrixZero {
    public static void main(String[] args){
        int[][] arr=getArr();
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i==2 ||j==2){
                    System.out.print(arr[i][j]=0);
                }else {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    static int[][] getArr(){
        return new int[][]{{1,1,1},{1,0,1},{1,1,1}};
    }
}
