package Aptitude.Calendar;

public class Binary_Search {
    public static void main(String[] args){
        int array[] = { 2, 3, 4, 10, 40 };
        System.out.println(getIndex(array,0, array.length-1,10));
    }

    static int getIndex(int arr[],int l,int e,int x){
        while(l<=e){
            int mid=l+(e-l)/2;
            if(arr[mid]==x){
                System.out.println(x+" found in index : "+mid);
                return mid;
            }else if (arr[mid]<=x){
                l=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
}
