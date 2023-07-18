package Sorting_Algorithm;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,30,4,5};
        select_sorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int getMax(int arr[], int start,int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void select_sorting(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1 ;
            int max=getMax(arr,0,last);
            int temp=arr[max];
            arr[max]=arr[last];
            arr[last]=temp;
        }
    }
}
