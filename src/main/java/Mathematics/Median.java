package Mathematics;

public class Median {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,0,0};
        int arr2[] = new int[]{3,5,6};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(merge(arr1, arr2));
    }

    static double merge(int[] first, int[] second) {
        int length = first.length + second.length;
        int index = 0;
        int arr[] = new int[length];
        for (int i = 0; i < first.length; i++) {
            arr[index] = first[i];
            index++;
        }
        for (int i = 0; i < second.length; i++) {
            arr[index] = second[i];
            index++;
        }
        System.out.println(index);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nAfter merging  two array and sorting an ascending order the the array is  : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int mid = arr.length / 2;
        System.out.println("middle : "+mid);
        double result = 0;
        if(arr.length%2==0){
            result=((arr[mid-1]+arr[mid])/2.0);
            System.out.println("result : "+result);
        }else {
            System.out.println("Hello");
            result=arr[mid];
        }
        return result;
    }
}
