package Searching_And_Sorting.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{12, 34, 56, 78, 90, 32, 54, 76, 98, 90};
        System.out.println("Before sorting the array element are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Sorting(array);
        System.out.println("After sorting the array element are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void Sorting(int arr[]) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int position = Smaller(arr, i);
//            System.out.println(i + " : " + position);
            int temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;
        }
    }

    static int Smaller(int arr[], int start) {
        int location = start, small = arr[start];
        for (int i = start + 1; i < arr.length; i++) {
//            System.out.println(i + " here " + (start + 1));
            if (arr[i] < small) {
                small = arr[i];
                location = i;
            }
        }
//        System.out.println("exit");
        return location;
    }
}
