package Aptitude.Calendar;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr=new int[]{12,3,34,4,45,5,56,67,7,78};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++){
            boolean swapped=false;
            for (int j=0;j<arr.length-i-1;j++){
                swapped=true;
                if(arr[j]<arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
