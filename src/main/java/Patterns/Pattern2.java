package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            for (int k = 5; k >= 0; k--) {
                for (int j = i; j < 5; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }

}
