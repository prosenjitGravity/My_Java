package OrganizationS_Zone.Practice.Brute_Force;

public class Descending {
    public static void main(String[] args) {
        int[] array = new int[]{12, 34, 56, 78, 90, 32, 54, 76, 98, 90};
//        int[] array = new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println("Before sorting the element is  : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Sort(array);
        System.out.println("\nAfter Sorting the arrays element is  : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void Sort(int arr[]) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            for (int j = 0; j < arr.length - i - 1; j++) {
//                System.out.println(i+" "+j);
                if (arr[j + 1] > arr[j]) {
//                    System.out.println(arr[j+1]+" > "+arr[j]);
                    arr[j + 1] = arr[j + 1] + arr[j];
                    arr[j] = arr[j + 1] - arr[j];
                    arr[j + 1] = arr[j + 1] - arr[j];
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
