package DSAlgo.Arrays;

public class ReverseRotate {
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6,7};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        int p=arr.length-1;
        int d=4;
        int l=arr.length-1;
        while(p>=d){
            int fast=arr[arr.length-1];
            for (int i=l;i>=1;i--){
                arr[i-1]=arr[i];
            }
            arr[0]=fast;
            p--;
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
