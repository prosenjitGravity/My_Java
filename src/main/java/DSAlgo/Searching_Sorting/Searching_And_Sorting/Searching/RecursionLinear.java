package DSAlgo.Searching_Sorting.Searching_And_Sorting.Searching;

public class RecursionLinear {
    public static void main(String[] args) {
        int array[] = new int[]{50,27,30,50,70,9,19};
        int result=searching(array, 0, 50);
        System.out.println(result);
    }

    static int searching(int arr[], int index, int target) {
        if (index==arr.length) {
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }else {
            return searching(arr, index + 1, target);
        }
    }
}
