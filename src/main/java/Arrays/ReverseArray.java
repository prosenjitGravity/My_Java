package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            System.out.print(arr[end]+" ");
            end--;
        }
        Integer[] arr1=new Integer[]{1,2,3,4,5,6,7,8,9};
        Collections.reverse(Arrays.asList(arr1));
        System.out.println(Arrays.asList(arr1));
    }
}
