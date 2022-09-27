package OrganizationS_Zone.TCS;

public class WithoutUsingAddOP {
    public static void main(String[] args) {
        int x = 200;
        int y = 400;
        System.out.println(check(x,y));
    }
    static int check(int a,int b) {
        for (int i = 1; i <= b; i++) {
            a++;
        }
        return a;
    }
}
