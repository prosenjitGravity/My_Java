package Sorting_Algorithm;
import java.util.Arrays;
public class Cyclic_Sort {
    public static void main(String[] args) {
        int arr[]=new int[]{1,4,2,5,6,3};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int arr[]) {
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
    }
}
