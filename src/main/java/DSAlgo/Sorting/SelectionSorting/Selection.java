package DSAlgo.Sorting.SelectionSorting;

public class Selection {
    public static void main(String[] args){
        int arr[]=new int[]{13,46,24,52,20,9};
        System.out.println("Before sorting the array element is  : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\nAfter sorting the array element are : ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
