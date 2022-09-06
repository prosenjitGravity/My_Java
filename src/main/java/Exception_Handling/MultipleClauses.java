package Exception_Handling;

public class MultipleClauses {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/20;
            int[] arr={1};
            System.out.println(b);
            arr[42]=99;
        }catch(ArithmeticException e){
            System.out.println("Something went wrong : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Something went wrong : "+e);
        }
    }
}
