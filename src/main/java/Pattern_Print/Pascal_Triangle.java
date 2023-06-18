package Pattern_Print;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_Triangle {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the integer : ");
        int num = Integer.parseInt(predator.readLine());
        println(generate_triangle(num));
        generate_triangle(num);
        System.out.println(generate(num));
    }

    static int[][] generate_triangle(int n) throws InterruptedException {
        int[][] pascal = new int[n][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
//                Thread.sleep(1000);
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        return pascal;
    }

    public static List<List<Integer>> generate(int numRows) {
        int pascal[][] = new int[numRows][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        return (List) Arrays.asList(pascal);
    }

    static void println(int[][] arr) throws InterruptedException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Thread.sleep(1000);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
