package OrganizationS_Zone.Practice.Recursion;

public class All_Permutation {
    public static void main(String[] args) {
        permutation("abc".toCharArray(), 0);
    }

    static void permutation(char[] arr, int fi) {
        if (fi == arr.length) {
            System.out.println(arr);
            return;
        }
        for (int i = fi; i < arr.length; i++) {
            swapping(arr, i, fi);
            permutation(arr, fi + 1);
            swapping(arr, i, fi);
        }
    }

    static void swapping(char arr[], int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
