package DSAlgo.Searching_Sorting.Sorting.SelectionSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("unsorted Array  : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nthe Sorted Array is  : ");
        for (int i = 0; i < selection(arr).length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] selection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                array[min] = array[min] + array[i];
                array[i] = array[min] - array[i];
                array[min] = array[min] - array[i];
            }
        }
        return array;
    }

    static int[] getArr() {
        return new int[]{40, 20, 60, 10, 50, 30};
    }
}
