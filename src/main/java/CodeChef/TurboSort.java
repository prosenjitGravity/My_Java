package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {
    public static void main(String[] java){
        Scanner predator=new Scanner(System.in);
        System.out.println("how many element you want : ");
        int[] arr=new int[predator.nextInt()];
        for (int i=0;i<arr.length;i++){
            arr[i]=predator.nextInt();
        }
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr.length-i-1;j++){
//                if(arr[j]>arr[j+1]){
//                    arr[j]=arr[j]+arr[j+1];
//                    arr[j+1]=arr[j]-arr[j+1];
//                    arr[j]=arr[j]-arr[j+1];
//                }
//            }
//        }
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
