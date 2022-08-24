package Striver_SDE_Sheet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class MyPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value : ");
        int n = Integer.parseInt(predator.readLine());
        int rc = 2 * n - 1;
        for (int i = 0; i < rc; i++) {
            for (int j = 0; j < rc; j++) {
                int r = n - getMin(i, j, rc - i - 1, rc - j - 1);
                System.out.print(r + "  ");
            }
            System.out.println();
        }
    }

    static int getMin(int a, int b, int c, int d) {
        return Collections.min(Arrays.asList(a, b, c, d));
    }
}
