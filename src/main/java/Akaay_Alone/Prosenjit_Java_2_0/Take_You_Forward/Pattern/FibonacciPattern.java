package Akaay_Alone.Prosenjit_Java_2_0.Take_You_Forward.Pattern;
import static Akaay_Alone.Prosenjit_Java_2_0.ReadInput.read_Input;
public class FibonacciPattern {
    public static void main(String[] args){
        System.out.println("Enter input : ");
        int num = Integer.parseInt(read_Input());
        fibo_Pattern(num);
    }
    static void fibo_Pattern(int num){
        int a=0,b=1,c=0;
        for(int i =0;i<num;i++){
            a=b;
            b=c;
            c=a+b;
            for(int j=0; j<i;j++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
