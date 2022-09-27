package LeetCode;

import java.util.Arrays;

public class AddTwoNumber {
    public static void main(String[] args){
        int arr[]=new int[]{2,4,3};
        int arr2[]=new int[]{5,6,4};
        System.out.println(Added(Reverse(arr),Reverse(arr2)));
        System.out.println(Arrays.toString(new int[]{Added(Reverse(arr), Reverse(arr2))}));
    }
    static int Reverse(int a[]){
        int sum=0;
        int i=0,j=a.length-1;
        while(i<=j){
            sum=sum*10+a[j];
            j--;

        }
        return sum;
    }
    static int Added(int a,int b){
        int add=a+b;
        int sumR=0;
        while(add>0){
            int remainder=add%10;
            sumR=sumR*10+remainder;
            add/=10;
        }
        return sumR;
    }
}
