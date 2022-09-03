package Exception_Handling;
import java.util.Random;
public class UsingRandom {
    public static void main(String[] args){
        Random r=new Random();
        int a=0,b=0,c=0;
        for(int i=0;i<32000;i++){
            try{
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(a/b);
                System.out.println("Result is  : "+a);
            }
            catch(ArithmeticException e){
                System.out.println("Something went wrong : "+e);
            }
        }
    }
}
