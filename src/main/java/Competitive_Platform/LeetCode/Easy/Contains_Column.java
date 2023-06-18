package Competitive_Platform.LeetCode.Easy;

public class Contains_Column {
    public static void main(String[] args) {
        System.out.println(checkValid(getArr()));
    }

    public static boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                if (i == j) {
                    if (matrix[i][j] !=1 || matrix[i][j] !=3 ) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static int[][] getArr() {
        return new int[][]{{1, 2, 3},
                {3, 1, 2},
                {2, 3, 1}
        };
    }
}
