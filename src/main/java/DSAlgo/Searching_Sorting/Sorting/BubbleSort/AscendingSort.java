package DSAlgo.Searching_Sorting.Sorting.BubbleSort;

public class AscendingSort {
    public static void main(String[] args) {
        int arr[] = getArray();
        System.out.println("Unsorted Array");
        for (int i = 0; i < getArray().length; i++) {
            System.out.print(getArray()[i] + " ");
        }
        System.out.println("\nAscending Sort array");
        for (int i = 0; i < ascending(arr).length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] ascending(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        return array;
    }
    static int[] getArray() {
        return new int[]{11, 77, 5, 22, 8, 99, 6, 33, 10};
    }
}
