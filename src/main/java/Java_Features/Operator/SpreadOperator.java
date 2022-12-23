package Java_Features.Operator;

public class SpreadOperator {
    public static void main(String[] args) {
        varargs(1, 2, 3, 4, 5);
    }

    static void varargs(int... v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
    }
}
