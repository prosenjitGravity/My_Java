package Competitive_Platform.Ninja;

import java.util.Arrays;

public class Diagonal_Upward_Matrix {
    public static void main(String [] args){
        getArr();
        for(int i=0;i< getArr().length;i++){
            for(int j =0;j<getArr()[i].length;j++){
                System.out.print(" "+getArr()[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] getArr(){
        return new int[][]{{00,01,02},{10,11,12},{20,21,22}};
    }

}
