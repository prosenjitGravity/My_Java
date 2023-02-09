package Competitive_Platform.GeeksForGeeks;

public class Kth_Smallest_element {
    public static void main(String[] args){
        System.out.println("Create an array : ");
        getValue(getArray(),3);
//        getValue(getArray(),3);
        System.out.println("new approach");
        System.out.println(kthSmallest(getArray(),0, getArray().length-1, 3));

    }
    static void getValue(int []arr,int k){
        int count=1;
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int j=0;j< arr.length;j++) {
            if (count == k) {
                System.out.println(arr[count]);
            }
            count++;
        }
    }
//    static void sorting(int array[]){
//        for(int i=0;i<array.length;i++){
//            for(int j=0;j<array.length-i-1;j++){
//                if(array[j]>array[j+1]){
//                    array[j]=array[j]^array[j+1];
//                    array[j+1]=array[j]^array[j+1];
//                    array[j]=array[j]^array[j+1];
//                }
//            }
//        }
//    }
    static int[] getArray(){
        return new int[]{7,10,4,3,20,15};
    }
    static int[] swapping(int[] arr,int start,int end){

        for (int i=start;i<end;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
        }
        return arr;
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        int sort[]=swapping(arr,l,r);
        for(int i=0;i< sort.length;i++){
            System.out.print(sort[i]+" ");
        }
        System.out.println("\nthe kth smallest element is : ");
        return arr[k-1];
    }
}
