package DSAlgo.Sorting.InsertionSort;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j>=0 && key<arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("\nthe sorted Array is  : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] getArray() {
        return new int[]{40, 20, 60, 10, 50, 30};
    }
}
