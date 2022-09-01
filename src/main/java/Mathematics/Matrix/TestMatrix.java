package Mathematics.Matrix;

import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the matrix size : ");
        int n=predator.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.println("Enter the "+i+""+j+" value");
                arr[i][j]=predator.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        System.out.println(arr[0].length);
    }
}
