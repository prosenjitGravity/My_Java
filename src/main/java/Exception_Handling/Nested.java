package Exception_Handling;

public class Nested {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int a = 10, b = 0, c;
                    c = a / b;
                    System.out.println("Execute Arithmetic");
                }
                catch (ArithmeticException ex) {
                    System.out.println("Something went wrong : " + ex);
                }
                int arr[] = new int[4];
                int i = arr[4];
                System.out.println("Execute ArrayIndex");
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Something went wrong : " + ex);
            }
            String s = "hello";
            int j = Integer.parseInt(s);
            System.out.println("Execute NumberFormat");
        }
        catch (NumberFormatException ex) {
            System.out.println("Something went wrong : " + ex);
        }
    }
}
