package Exception_Handling;

public class NumberFormat {
    public static void main(String[] args){
        try{
            int n=Integer.parseInt("java");
            System.out.println("The number is  : "+n);
        }catch(NumberFormatException e){
            System.out.println("Something went wrong : "+e);
        }
    }
}
