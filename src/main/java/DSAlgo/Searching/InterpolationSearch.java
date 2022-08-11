package DSAlgo.Searching;

import java.util.Scanner;

public class InterpolationSearch {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("enter the element : ");
        int element=predator.nextInt();
        System.out.println(Interpolation(new int[]{1,2,3,4,5,6,7,8,9,10},element));

    }
    static int Interpolation(int[] arr,int target){
        int start=0,end=arr.length-1,mid;
        while(start<=end){
            mid=((start+end)*(target-arr[start]))/(arr[end]-arr[start]);
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
        }
        return -1;
    }
}
