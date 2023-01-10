package Competitive_Platform.LeetCode;

public class Set_Matrix_Zeroes {
    public static void main(String[] args){
        println(getMatrix());
    }
    static int[][] getMatrix(){
        return new int[][]{{1,1,1},{1,0,1},{1,1,1}};
    }
    static void println(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    /*
    * 00 01 02
    * 10 11 12
    * 20 22 23
    * */
    static int[][] zeroValue(int matrix[][]){
        int [][] m=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==0){

                }
            }
        }
        return m;
    }
}
