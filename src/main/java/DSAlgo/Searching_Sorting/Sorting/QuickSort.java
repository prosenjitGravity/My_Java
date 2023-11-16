package DSAlgo.Searching_Sorting.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] num=new int[]{10,80,30,90,40,50,70};
        Sorting(num,0,num.length-1);
        System.out.println(Arrays.toString(num));

    }
    public static void Sorting(int[] arr,int low,int hi){
        int start=low;
        int end=hi;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        if(low>=hi){
            return;
        }
        while(start<=end){
            while(arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        Sorting(arr,low,end);
        Sorting(arr,start,hi);
    }
}
