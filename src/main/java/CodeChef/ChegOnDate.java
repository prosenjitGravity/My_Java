package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChegOnDate {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(predator.readLine());
        while (t-- > 0) {
            int x = Integer.parseInt(predator.readLine());
            int y = Integer.parseInt(predator.readLine());
            if (x >= y) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
