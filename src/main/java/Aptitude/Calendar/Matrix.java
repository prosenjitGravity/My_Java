package Aptitude.Calendar;

public class Matrix {
    public static void main(String[] args){
        int[] matrix[]=new int[][]{{1,0 ,0 ,0 ,0},{0,0,1,1,0},{0,1,1,0,0},{0,0,0,0,0},{1,1,0,0,1},{1,1,0,0,1}};
        for(int i=0;i<6;i++){
            for(int j=0;j<5;j++){
                System.out.print(matrix[j][j]+" ");
            }
        }
        int count = 0;  // Counter to keep track of rows with all zeros
        int M=6;
        int N=5;
        System.out.println();
        // Count the number of rows with all zeros
        for (int i = 0; i < M; i++) {
            boolean allZeros = true;  // Flag to check if all elements in a row are zeros
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] != 0) {


                    allZeros = false;  // Found a non-zero element, so the row doesn't have all zeros
                    break;
                }
            }
            if (allZeros) {
                count++;  // Increment the counter if the row has all zeros
            }
        }

        System.out.println(count);

    }
}
