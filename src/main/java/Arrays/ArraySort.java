package Arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 0, 1, 9, 10, 20, 2, 15, 78};
        System.out.println("Array sorting : ");
        System.out.println(Arrays.toString(Sorting(array)));
        System.out.println("the Max element is  : "+MaxElement(array));
        System.out.println("the Min element is  : "+MinElement(array));
        System.out.println("The SecMax Element is  : "+SecMax(array));
        System.out.println("The SecMax Element is  : "+SecMin(array));
    }

    static int[] Sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    static int MaxElement(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int SecMax(int arr[]){
        int secmax=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=MaxElement(arr)){
                if(secmax<arr[i]){
                    secmax=arr[i];
                }
            }
        }
        return secmax;
    }
    static int MinElement(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int SecMin(int arr[]){
        int secmin=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=MinElement(arr)){
                if(arr[i]<secmin){
                    secmin=arr[i];
                }
            }
        }
        return secmin;
    }
}
