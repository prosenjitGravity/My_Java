package Pattern_Print;

public class My_Pattern {
    public static void main(String[] args){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
    }
    static void pattern1(int n){
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        System.out.println("---------------------------------");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("  ");
            }
            for(int k=n;k>i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        System.out.println("--------------------------------");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        System.out.println("--------------------------------");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            for(int j=0;j<i;j++) {
                System.out.print("  ");
            }
            for(int k=0;k<i;k++) {
                System.out.print("  ");
            }
            for(int l=i;l<n;l++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=i;j<n-1;j++) {
                System.out.print("  ");
            }
            for(int k=i;k<n-1;k++){
                System.out.print("  ");
            }
            for(int l=0;l<=i;l++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
