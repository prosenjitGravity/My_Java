package OrganizationS_Zone.Wiely_Edge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class X_pattern {
    public static void main(String[] arg) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter value : ");
        int num = Integer.parseInt(predator.readLine());
        for (int i = 0; i < num; i++) {
            System.out.println("print : " + i + "th");
            pattern_x((i * 2) - 1);
        }
        ;
    }
    static void pattern_x(int n) {
        int c = 0, d = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (j <= (n / 2)) {
                        System.out.print(++c);
                    } else {
                        System.out.print(--c);
                    }
                } else if (j == n - i - 1) {
                    if (j >= (n / 2)) {
                        System.out.print(++d);
                    } else {
                        System.out.print(d--);
                    }
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
