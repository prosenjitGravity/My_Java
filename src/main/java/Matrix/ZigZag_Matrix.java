package Matrix;

public class ZigZag_Matrix {
    public static void main(String[] args) {
        println(getMatrix());
        System.out.println();
        diagonal(getMatrix());
    }

    static void println(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void diagonal(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j< matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] getMatrix() {
        return new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }
}