package DSAlgo.Searching;

public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int start = 0, end = (int) Math.sqrt(arr.length - 1);
        while (arr[end] <= target && end < target) {
            end += Math.sqrt(arr.length - 1);
            System.out.println("end+= " + end);
            if (end > arr.length - 1) {
                end = arr.length;
                System.out.println("if condition  : " + end);
            }
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                System.out.println("position is : " + i);
            }
        }
    }
}
