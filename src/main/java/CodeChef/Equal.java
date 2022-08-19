package CodeChef;

import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner predator = new Scanner(System.in);
        int t = predator.nextInt();
        while (t-- > 0) {
            int x = predator.nextInt();
            int y = predator.nextInt();
            if (x == y) {
                System.out.println("Yes");
            } else if (x>y) {
                System.out.println("No");
            }else{

            }
        }
    }
}
