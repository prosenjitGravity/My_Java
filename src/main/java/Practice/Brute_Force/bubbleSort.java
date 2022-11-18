package Practice.Brute_Force;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 34, 56, 78, 90,10, 32, 54, 76, 98, 90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
//                    arr[j] = arr[j] + arr[j + 1];
//                    arr[j + 1] = arr[j] - arr[j + 1];
//                    arr[j] = arr[j] - arr[j + 1];
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
