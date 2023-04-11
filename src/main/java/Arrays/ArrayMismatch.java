package Arrays;

import java.util.Arrays;

public class ArrayMismatch {
    public static void main(String[] args){
        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[]{1,2,4,4,5};
        int index= Arrays.mismatch(arr1,arr2);
        if(index == -1){
            System.out.println("Arrays are identical");
        }
        else{
            System.out.println("First mismatch at index : "+index);
        }
    }
}
