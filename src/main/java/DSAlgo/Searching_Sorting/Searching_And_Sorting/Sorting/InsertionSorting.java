package DSAlgo.Searching_Sorting.Searching_And_Sorting.Sorting;

public class InsertionSorting {
    public static void main(String[] args){
        int[] array = new int[]{12, 34, 56, 78, 90, 32, 54, 76, 98, 90};
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        Sorting(array);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void Sorting(int arr[]){
        int temp=0;
        for (int i=1;i<arr.length;i++){
            int j=i-1;
            temp=arr[i];
            while (temp<arr[j]&& j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
