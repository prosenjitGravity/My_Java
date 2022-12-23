package Java_Features.Java_Input.Matrix;

public class RowLength {
    public static void main(String[] args) {
        int arr[][] = getArr();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("length of row 0 row is : " + arr[1].length);
    }

    static int[][] getArr() {
        return new int[][]{{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
    }
}
