package Competitive_Platform.LeetCode.Easy;

import java.util.Arrays;

public class Countging_Bits  {
    public static void main(String[] args){
        int[] arr=countBits(5);
        System.out.println(Arrays.toString(arr));
    }
    static public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=1;i<=n;i++){
            System.out.println(arr[i &(i-1)]);
            arr[i]=arr[i & (i-1)]+1;

        }
        return arr;
    }
}
