package OrganizationS_Zone.Practice.Recursion;

public class Summation {
    static void print(int i, int n) {
        if (i < 1) {
            System.out.println(n);
            return;
        }
        print(i - 1, n + i);
    }

    public static void main(String[] args) {
        print(5, 0);
    }
}
