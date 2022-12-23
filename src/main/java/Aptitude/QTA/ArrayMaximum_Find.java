package Aptitude.QTA;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class ArrayMaximum_Find {
    public static void main(String[] args) throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many element you want");
        int[] array=new int[Integer.parseInt(predator.readLine())];
        for (int i=0;i<array.length;i++){
            System.out.println("enter the "+i+"th element");
            array[i]=Integer.parseInt(predator.readLine());
        }
        println(array);
        System.out.println("Max Element is  : "+findMax(array));
        System.out.println("Min Element is  : "+findMin(array));
    }
    static void println(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int findMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    static int findMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
