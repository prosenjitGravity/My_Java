package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayForEach {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
