package Competitive_Platform.LeetCode.Medium;

public class Sum_in_a_Matrix {
    static public int matrixSum(int[][] nums) {
        int sum = 0;
        for (int i = 0; i < nums[0].length; i++) {
            int max = 0;
            for (int j = 0; j < nums[i].length; j++) {
                if (max < nums[j][i]) {
                    max = nums[j][i];

                }
            }
            System.out.println(max);
            sum += max;
        }
        System.out.println(sum);
        return sum;
    }

    static int[][] getMatrix() {
        return new int[][]{{7, 2, 1}, {6, 4, 2}, {6, 5, 3}, {3, 2, 1}};
    }

    public static void main(String[] args) {
        matrixSum(getMatrix());
    }
}
