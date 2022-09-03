package Exception_Handling;

public class Arithmetic {
    public static void main(String[] args){
        int a=20;
        int b=0;
        try{
            int result=a/b;
            System.out.println(a+" / "+b+" = "+result);
        }catch(ArithmeticException e){
            System.out.println("Something Went Wrong : "+e);
        }
    }
}
