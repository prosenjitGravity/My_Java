package Competitive_Platform.LeetCode;

public class Matrix_diaginal_sum {
    public static void main(String[] args) {
        System.out.println(diagonal(getArr()));
    }

    /*
     * 00 01 02 || 1 2 3
     * 10 11 12 || 4 5 6
     * 20 21 22 || 7 8 9
     * */
    static int diagonal(int matrix[][]) {
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length-1; j >=0; j--) {
                if(i==j||i+j== matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    static int[][] getArr() {
        return new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
}
