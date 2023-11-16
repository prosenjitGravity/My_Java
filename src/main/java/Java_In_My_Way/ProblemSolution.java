package Java_In_My_Way;

import java.util.Scanner;

public class ProblemSolution {
    static Scanner sc = new Scanner(System.in);

    static public int solution(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return rotate(arr, 3, arr.length, 2);
    }

    public static int rotate(int arr[], int d, int n, int t) {
        int p = 1;
        while (p <= d) {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                sum2 += arr[i];
            } else {
                sum += arr[i];
            }
        }
        System.out.println("sum : " + sum);
        System.out.println("sum : " + sum2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        return sum>sum2?sum-sum2:sum2-sum;
    }

}
class main{
    public static void main(String[] args){
        ProblemSolution ps=new ProblemSolution();
        System.out.println((ps.solution(6)));
    }
}
