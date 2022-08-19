package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInterChange {
    public static void main(String[] args)throws IOException {
        int[] arr=new int[]{1,2,3,4,5,6,7,8};
        InputStreamReader ask=new InputStreamReader(System.in);
        BufferedReader predator=new BufferedReader(ask);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the location : ");
        int index=Integer.parseInt(predator.readLine());
        System.out.println("Enter the location : ");
        int index1=Integer.parseInt(predator.readLine());
        if((index>=0 && index<=arr.length-1)&& (index1!=index && index1<=arr.length-1)){
//            arr[index]=arr[index]+arr[index1];
//            arr[index1]=arr[index]-arr[index1];
//            arr[index]=arr[index]-arr[index1];
            int temp=arr[index];
            arr[index]=arr[index1];
            arr[index1]=temp;
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Wrong Input ?");
        }

    }
}
