package Competitive_Platform.LeetCode;

public class Rotate_Image {
    public static void main(String[] args){
        rotate(getMatrix());
    }
    static void rotate(int[][] matrix){
        System.out.print("[");
        for(int i=0;i<matrix.length;i++){
            System.out.print("[");
            for(int j=matrix.length-1;j>=0;j--){
                System.out.print(matrix[j][i]+"");
                if(j>0){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(i!=matrix.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
//        int start = 0;
//        int end = matrix.length - 1;
//
//        int[] corners = new int[4];
//
//        // peel like an onion, outer layer to inner
//        // swap elements starting from the corners and moving clockwise
//        while(start < end) {
//            for(int offset = 0; offset < (end-start); offset++) {
//                corners[0] = matrix[start][start + offset]; // TL
//                corners[1] = matrix[start + offset][end];   // TR
//                corners[2] = matrix[end][end - offset];     // BR
//                corners[3] = matrix[end - offset][start];   // BL
//
//                matrix[start + offset][end]   = corners[0]; // TL to TR
//                matrix[end][end - offset]     = corners[1]; // TR to BR
//                matrix[end - offset][start]   = corners[2]; // BR to BL
//                matrix[start][start + offset] = corners[3]; // BL to TL
//            }
//            start++;
//            end--;
//        }
    }
    static int[][] getMatrix(){
        return new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
}
