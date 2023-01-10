package Matrix;

import java.io.PrintWriter;

class typeMatrix<T>{
     T[][] matrix;
     public typeMatrix(T matrix[][]){
         this.matrix=matrix;
     }
     T RotateMatrix(T[][]matrix){
         T[][] rotate= (T[][]) new Object[matrix.length][matrix.length];
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix.length;j++){
                 rotate[j][matrix.length-i-1]=matrix[i][j];
             }
         }
         return (T) rotate;
     }
     void println(T arr[][]){
         for(T[] i:arr){
             for(T j:i){
                 System.out.print(j+" ");
             }
             System.out.println();
         }
     }
      void UsingWriter(){
         PrintWriter out=new PrintWriter(System.out);
         out.println("Hello");
     }
 }
public class Generics_Matrix {
     public static void main(String[] args){
         typeMatrix<Integer> type=new typeMatrix<Integer>(getArray());
         type.println(getArray());
     }
     static Integer[][] getArray(){
         return new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};
     }
}
