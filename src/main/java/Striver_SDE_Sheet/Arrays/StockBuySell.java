package Striver_SDE_Sheet.Arrays;

import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int arr[]={7,1,5,3,6,4};
        int profit=0;
        for (int i=0;i<arr.length;i++){
           for (int j=i+1;j<arr.length;j++){
               if(arr[j]>arr[i]){
                   profit=Math.min(arr[j]-arr[i],profit);
               }
           }
        }
        System.out.println(profit);
    }
}
