package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpdateValue {
    static int n;
    public static void main(String[] args)throws IOException {
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many element you want : ");
        n=Integer.parseInt(predator.readLine());
        int[] arr=new int[20];
        for (int i=0;i<n;i++){
            System.out.println("enter the "+i+"th data : ");
            arr[i]=Integer.parseInt(predator.readLine());
        }
        System.out.println("You entered elements are : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter the index location  : ");
        int index=Integer.parseInt(predator.readLine());
        System.out.println("enter the data : ");
        int value=Integer.parseInt(predator.readLine());
        Insert(arr,index,value);
    }
    static void Insert(int[] arr,int location,int data){
        arr[location]=data;
        System.out.println("The array elements are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
