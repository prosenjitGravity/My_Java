package Competitive_Platform.LeetCode.Medium;

public class DivisibleByk {
    public static void main(String[] args) {
        System.out.println(canArrange(new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5));
    }

    static public boolean canArrange(int[] arr, int k) {
        for (int i = 0; i < arr.length/2; i++) {
            if (((arr[i] + arr[arr.length  - i-1]) / k)==0) {
                return false;
            }
        }
        return true;
    }
}
