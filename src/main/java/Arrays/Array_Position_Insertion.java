package Arrays;

import java.util.Scanner;

public class Array_Position_Insertion {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        int arr[]=new int[]{1,3,5,6};
        println(arr);
        insert(arr);
        println(arr);
    }
    static void insert(int arr[]){
//        System.out.println("enter the position : ");
//        int position=predator.nextInt();
        System.out.println("enter the value : ");
        int target=predator.nextInt();
        int length= arr.length;
        for(int i=0;i<length;i++){
            if(arr[i]>target){
                arr[i-1]=target;
                break;
            }else if(arr[i]<target){
                arr[i+1]=target;
                break;
            }else{
                arr[i]=target;
                break;
            }
        }


    }
    static void println(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
