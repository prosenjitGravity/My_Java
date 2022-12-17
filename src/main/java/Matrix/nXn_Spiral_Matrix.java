package Matrix;
import java.util.Scanner;
public class nXn_Spiral_Matrix {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("how many row x column you want");
        int n=predator.nextInt();
        int spiral[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("enter "+i+j+"th element ");
                spiral[i][j]=predator.nextInt();
            }
        }
        monitoring(spiral);
        System.out.println();
        monitoring(createSpiral(n));
    }
    static void monitoring(int arr[][]){
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static int[][] createSpiral(int n){
        int matrix[][]=new int[n][n];
        int left_col=0,right_col=n-1,top_row=0,bottom_row=n-1;
        int sequence=1;
        while(sequence<=(n*n)){
            for(int i=left_col;i<=right_col && sequence<=(n*n);i++){
                matrix[top_row][i]=sequence;
                sequence++;
            }
            top_row++;
            for(int j=top_row;j<=bottom_row && sequence<=(n*n);j++){
                matrix[j][right_col]=sequence;
                sequence++;
            }
            right_col--;
            for(int i=right_col;i>=left_col  && sequence<=(n*n);i--){
                matrix[bottom_row][i]=sequence;
                sequence++;
            }
            bottom_row--;
            for(int j=bottom_row;j>=top_row && sequence<=(n*n);j--){
                matrix[j][left_col]=sequence;
                sequence++;
            }
            left_col++;
        }
        return matrix;
    }
}
