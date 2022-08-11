package DSAlgo.Sorting;

public class AscendingOrder {
    public static void main(String[] args){
        int []storage=getArray();
        System.out.println("Before sorting The array is : ");
        for (int i=0;i<storage.length;i++){
            System.out.print(storage[i]+" ");
        }
        Ascending(storage);

    }
    static void Ascending(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=1;j< arr.length-1;j++){
                System.out.println(arr[i]+ " == "+arr[j]);
            }
        }
    }
    static int[] getArray(){
        return new int[]{11,77,5,22,8,99,6,33,10};
    }
}
