package OrganizationS_Zone.Accenture;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(description(7, 2, new int[]{2, 8, 3, 5, 7, 4, 1, 2}));
    }

    static int description(int r, int unit, int[] arr) {
        int res = r * unit;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
            if (res <= sum) {
                break;
            }
        }
        return count;
    }
}
