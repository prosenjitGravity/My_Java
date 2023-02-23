package Mathematics.LambdaExpression.Lambda_Interface;
import java.util.Scanner;
interface NumericTest {
    boolean Test(int n);
}

public class EvenOdd {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the element : ");
        int num=predator.nextInt();
        NumericTest nt;
        nt = (x) -> (num % 2) == 0;
        if (nt.Test(num)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
