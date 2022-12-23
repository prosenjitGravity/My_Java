package OrganizationS_Zone.Practice.Patterns;

public class Youtube {
    public static void main(String[] args) {
        System.out.println("YouTube Pattern print : ");
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= n-i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//            for(int k=0;k<i;k++){
//                System.out.print("* ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<i;k++){
//                System.out.print("* ");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("  ");
//            }
//            for(int k=i;k>0;k--){
//                System.out.print("* ");
//            }
    }
}
