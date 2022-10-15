package Practice.Recursion;

public class ArrayReverse {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        printArray(arr);
        reverse(0,arr.length-1,arr);
        System.out.println("\nReverse Array Using Recursion : ");
        printArray(arr);
    }
    static void reverse(int i,int j,int a[]){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
}
