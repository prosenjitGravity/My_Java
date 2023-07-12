package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        boolean is=sorted(new int[]{1,2,10,3,4,5,6,7,8},0);
        System.out.println(is);
    }
    static boolean sorted(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
