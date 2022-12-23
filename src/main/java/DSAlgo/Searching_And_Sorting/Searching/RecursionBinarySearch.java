package DSAlgo.Searching_And_Sorting.Searching;

public class RecursionBinarySearch {
    public static void main(String[] args){
        int array[]=new int[] {1,2,3,4,5,57,66,88,99};
        int req=search(array,57,0,array.length-1);
        System.out.println(req);
    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int middle=start+(end-start)/2;
        if(arr[middle]==target){
            return middle;
        }
        if(target<arr[middle]){
            return search(arr,target,start,middle-1);
        }
        return search(arr,target,middle+1,end);
    }
}
