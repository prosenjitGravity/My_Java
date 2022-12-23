package Competitive_Platform.LeetCode;

public class MatrixMultiplication {
    public static void main(String[] args){
        Multiplication(getArr1(),getArr2());
        Addition(getArr1(),getArr2());
    }
    static int[][] getArr1(){
        return new int[][]{{1,1,1},{2,2,2},{3,3,3}};
    }
    static int[][] getArr2(){
        return new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
    static void Multiplication(int[][] arr1,int[][] arr2){
        System.out.println("first Array : ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second Array : ");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Matrix Multiplication");
        int [][] arr3=new int[arr1.length][arr2.length];
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3.length;j++){
                arr3[i][j]=0;
                for(int k=0;k<arr3.length;k++){
                    arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("After Multiplication");
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3.length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Addition(int[][] a,int[][] b){
        int[][] add=new int[a.length][b.length];
        for(int i=0;i<add.length;i++){
            for(int j=0;j<add.length;j++){
                add[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition matrix : ");
        for(int i=0;i<add.length;i++){
            for(int j=0;j<add.length;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
