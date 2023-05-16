package Java_In_My_Way.Interview_Practice.Sorting_Algo;

public class Bubble_sort {
    public static void main(String[] args) {
        sorting(new int[]{12, 32, 11, 10, 65, 76, 54, 33, 100, 75});
    }

    static void sorting(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
    }
}
