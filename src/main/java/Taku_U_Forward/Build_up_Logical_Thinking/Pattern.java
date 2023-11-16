package Taku_U_Forward.Build_up_Logical_Thinking;

public class Pattern {
    public static void main(String[] args){
        int n=5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
    }
    static  void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern6(int n){
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern10(int n){
        int c=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c+++" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern11(int n){

        for(int i=0;i<n;i++){
            char c=65;
            for(int j=0;j<=i;j++){
                System.out.print(c+++" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern12(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
