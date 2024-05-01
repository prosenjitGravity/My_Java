package Competitive_Platform.LeetCode.Medium;

//
public class Diagonal_Traverse {
    public static void main(String[] args){
        findDiagonalOrder(getArr());
    }
    static public void findDiagonalOrder(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            if(i%2==0){
                for(int j=0;j<i;j++){
                    System.out.print(mat[i][j]);
                }

            }else{

            }
        }
    }
    static int[][] getArr(){
        return new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    }
}
