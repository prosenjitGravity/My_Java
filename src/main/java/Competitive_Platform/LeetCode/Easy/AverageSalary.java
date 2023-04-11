package Competitive_Platform.LeetCode.Easy;

import java.util.Arrays;

public class AverageSalary {
    public static void main(String[] args){
        System.out.println(average(new int[]{8000,9000,2000,3000,6000,1000}));
        average1(new int[]{8000,9000,2000,3000,6000,1000});
    }
    static public double average(int arr[]){
        int max=arr[0];
        int min=arr[0];
        int total=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
            total+=arr[i];
            count++;
        }
//        System.out.println("max : "+max+" & min : "+min);
        return (total-(max+min))/(count-2);
    }
    static public void average1(int[] salary){ //       [8000,9000,2000,3000,6000,1000]
        int average=0;
        Arrays.sort(salary);                // after sorting [1000,2000,3000,6000,8000,9000]
        for(int i=1;i< salary.length-1;i++){
            average+=salary[i];
        }
        System.out.println("average : "+average/(salary.length-2));
    }
}
