package Aptitude.Calendar;

public class BinarySearchRecursion {
    public static void main(String[] args){
        int[] array=new int[]{2, 30, 4, 10, 40,3};
        System.out.println(getIndex(array,0,array.length-1,30));
        System.out.println(getIndex(array,0,array.length-1,30)!=-1? true : false);
    }
    static int getIndex(int arr[],int beg,int end,int target){
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                return getIndex(arr,beg,mid-1,target);
            }else{
                return getIndex(arr,mid+1,end,target);
            }
        }
        return -1;
    }
}
