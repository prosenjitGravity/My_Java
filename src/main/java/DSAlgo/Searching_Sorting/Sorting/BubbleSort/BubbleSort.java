package DSAlgo.Searching_Sorting.Sorting.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("This is unsorted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n Ascending Sort : ");
        for (int i = 0; i < AscendingSort.ascending(arr).length; i++) {    //using for loop    ascending(arr).length
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n Descending Sort : ");
        for (int i : DescendingSort.descending(arr)) {                     // using foreach loop    descending(arr)
            System.out.print(i + " ");
        }
    }

    static int[] getArr() {
        return new int[]{11, 77, 5, 22, 8, 99, 6, 33, 10};
    }

}
