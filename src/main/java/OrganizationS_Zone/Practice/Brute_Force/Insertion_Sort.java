package OrganizationS_Zone.Practice.Brute_Force;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] array = new int[]{12, 34, 56, 78, 90, 32, 54, 76, 98, 90};
        System.out.println("Before Sorting the array is  : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        Insert(array);
        System.out.println("After Sorting the array element is : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    static void Insert(int arr[]) {
        int temp = 0, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i - 1;
            while ((temp < arr[j]) && (j >= 0)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
