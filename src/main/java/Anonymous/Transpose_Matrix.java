package Anonymous;

public class Transpose_Matrix {
    public static void main(String[] args) {
//        Monitoring(transposeMatrix(getArray()));
        System.out.println("After rotating matrix");
//        Monitoring(rotateImage(transposeMatrix(getArray())));
        transposeMatrix1(getArray());



    }

    static int[][] transposeMatrix(int[][] array) {
        int[][] transpose = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[i][j] = array[j][i];
            }
            System.out.println();
        }
        return transpose;
    }

    static void Monitoring(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] rotateImage(int[][] matrix) {
        int rotate[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotate[i][j] = matrix[i][matrix.length - j - 1];
            }
        }
        return rotate;
    }

    static int[][] getArray() {
        return new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }


    //    procedure two
    static void transposeMatrix1(int[][] array) {
//    int[][] transpose=new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
//            transpose[i][j]=array[j][i];
                int temp = 0;
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        Monitoring(array);
        System.out.println();
        for(int i=0;i< array.length;i++){
            for(int j=0;j< array.length/2;j++){
                int temp=0;
                temp=array[i][j];
                array[i][j]=array[i][array.length-j-1];
                array[i][array.length-j-1]=temp;
            }
        }
        Monitoring(array);
    }

}
