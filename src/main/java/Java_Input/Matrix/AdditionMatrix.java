package Java_Input.Matrix;

public class AdditionMatrix {
    public static void main(String[] java){
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
        System.out.println("Addition of two matrix");
        int[][] sum=new int[arr1.length][arr2.length];
        for(int i=0;i< arr1.length;i++){
            for (int j=0;j< arr1.length;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("After addition the matrix is ");
        for (int i=0;i<sum.length;i++){
            for(int j=0;j<sum.length;j++){
                System.out.print(sum[i][j]+" ");
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
