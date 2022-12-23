package Competitive_Platform.GeeksForGeeks;
import java.util.*;

public class Median_in_a_row_wise_sorted_Matrix {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("how many row you want : ");
        int r=predator.nextInt();
        System.out.println("how many column you want : ");
        int c=predator.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("insert matrix value : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("enter the  "+i+j+"th value : ");
                arr[i][j]=predator.nextInt();
            }
        }
        System.out.println("Now monitoring the matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("2D array convert into 1D array : ");
        int array[]=new int[r*c];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[k]=arr[i][j];
                k++;
            }
        }

        System.out.println("Now monitoring th linear matrix : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("now Check the median value : ");
        int m=array.length%2==0 ? array[(array.length-1)/2]: array[((array.length-1)+1)/2];
//        if(array.length%2==0){
//            System.out.println(array[(array.length)/2]);
//        }else{
//            System.out.println(array[(array.length+1)/2]);
//        }
        System.out.println("Median is : "+m);
    }
}
