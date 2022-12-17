package Aptitude.QTA;

public class FibonacciSeries {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            printSeries(arr[i]);
        }
        System.out.println();
    }
    static void printSeries(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }

}
