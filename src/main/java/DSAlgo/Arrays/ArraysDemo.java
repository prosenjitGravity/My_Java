package DSAlgo.Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args){
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=-3*i;
        }
        System.out.println("Monitoring the original content : ");
        monitoring(arr);
        Arrays.sort(arr);
        System.out.println("After sorting : ");
        monitoring(arr);
        Arrays.fill(arr,2,6,-1);
        System.out.println("After using fill() method : ");
        monitoring(arr);
        Arrays.sort(arr);
        System.out.println();
        monitoring(arr);
        System.out.println("\nfind : "+Arrays.binarySearch(arr,-1));
    }
    static void monitoring(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
