package Java_Input.Matrix;

public class MatrixMultiplication {
    public static void main(String[] args) {
        System.out.println("1st Array");
        int arr1[][]=getArr();
        for (int i=0;i< arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2st Array");
        int arr2[][]=getArr1();
        for (int i=0;i< arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int[][] multiple=new int[arr1.length][arr2.length];
        for(int i=0;i< arr1.length;i++){
            for (int j=0;j< arr1.length;j++){
                multiple[i][j]=0;
                for(int k=0;k< multiple.length;k++){
                    multiple[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("After multiplication the matrix is ");
        for (int i=0;i<multiple.length;i++){
            for(int j=0;j<multiple.length;j++){
                System.out.print(multiple[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] getArr(){
        return new int[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}};
    }
    static int[][] getArr1(){
        return new int[][]{{1,1,1},{2,2,2},{3,3,3}};
    }
}
