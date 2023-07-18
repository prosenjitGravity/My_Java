package Competitive_Platform.Java_In_My_Way.Interview_Practice.Sorting_Algo;

public class Binary_Search {
    public static void main(String[] args){
        int[] arr=new int[]{1,3,5,6,8,9,10};
        System.out.println("process 1...");
        System.out.println(search1(arr,8,0,arr.length-1));
        System.out.println("process 2...");
        System.out.println(search2(arr,9));
    }
    static boolean search1(int array[], int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return true;
            }else if(array[mid]<=target){
                return search1(array,target,mid+1,end);
            }else{
                return search1(array,target,start,mid-1);
            }
        }
        return false;
    }
    static int search2(int array[], int target){
        int start=0; int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                start=mid+1;
            }else if(array[mid]>target){
                end=mid-1;
            }else{
            }
        }
        return -1;
    }
}
