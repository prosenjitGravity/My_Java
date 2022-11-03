package Anonymous;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class IntegerReverse {
    public static void main(String[] args) throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter  the  number : ");
        int n=Integer.parseInt(predator.readLine());
        System.out.println(n+" is  : "+isReverse(n));
    }
    static int isReverse(int number){
        int reverse=0;
        int remainder;
        while(number!=0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number/=10;
        }
        return reverse;
    }
}
