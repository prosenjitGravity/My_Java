package Competitive_Platform.LeetCode;

public class MedianMath {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4};
        int l=arr.length;
        System.out.println("the array length is  : "+l);
        int mid=l/2;
        double result=0;
        if(l%2==0){
            result=((arr[mid-1]+arr[mid])/2.0);
            System.out.println("result : "+result);
        }else {
            System.out.println("Hello");
            result=arr[mid];
        }
        System.out.println(result);
    }
}
