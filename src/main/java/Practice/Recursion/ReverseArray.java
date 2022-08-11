package Practice.Recursion;

import static java.util.Collections.swap;

public class ReverseArray {
     static void reverse(int arr[], int i, int n) {
          if (i >= n) {
               return;
          }
//          swap(<Integer> arr[i],arr[n-i-1]);
          reverse(arr, i + 1, n);
     }
          public static void main(String[] args){
               int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
               reverse(array, 0, array.length - 1);
          }
}
