package Exception_Handling.My_Exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Running_Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader predator =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter number : ");
        int n=Integer.parseInt(predator.readLine());
        for(int i=0;i<n;i++) {
            try {
                System.out.println(n / i);
            } catch (ArithmeticException ex) {
                System.out.println("Something Went Wrong : " + ex);
            }
        }
    }
}
