package Competitive_Platform.LeetCode;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        System.out.println("\nprint 1st Array :");
        println(getmArray());
        System.out.println("\nprint 1st Sorting Array :");
        println(arraySort(getmArray()));

        System.out.println("\nprint 2nd Array :");
        println(getnArray());
        System.out.println("\nprint 2nd Sorting Array :");
        println(arraySort(getnArray()));

        System.out.println("\nMerging two array");
        println(mergeArray(getmArray(), getnArray()));
        System.out.println("\nAfter merging sort all element ");
        println(arraySort(mergeArray(getmArray(), getnArray())));

    }

    static void println(int[] getarr) {
        for (int i = 0; i < getarr.length; i++) {
            System.out.print(getarr[i] + " ");
        }
    }

    static int[] getmArray() {
        return new int[]{1, 2, 3, 0, 0, 0};
    }

    static int[] getnArray() {
        return new int[]{101, 20, 35, 47, 55, 69, 100};
    }

    static int[] mergeArray(int[] arrm, int[] arrn) {
        int index = 0;
        int[] newArray = new int[arrm.length + arrn.length];
        System.out.println("the array length is  : " + newArray.length);
        for (int i = 0; i < arrm.length; i++) {
            newArray[index] = arrm[i];
            index++;
        }
        for (int j = 0; j < arrn.length; j++) {
            newArray[index] = arrn[j];
            index++;
        }
        return newArray;
    }

    static int[] arraySort(int sort[]) {
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] > sort[j + 1]) {
                    sort[j] = sort[j] ^ sort[j + 1];
                    sort[j + 1] = sort[j] ^ sort[j + 1];
                    sort[j] = sort[j] ^ sort[j + 1];
                }
            }
        }
        return sort;
    }
}
