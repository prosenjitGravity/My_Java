package Mathematics.Matrix;

public class DiagonalMatrix {
    public static void main(String[] args){
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Monitoring matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Print diagonally 1 : ");
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("first : "+arr[i][i]);
                System.out.println(arr[j][arr.length - 1 - j] );
            }
        }

    }
}
