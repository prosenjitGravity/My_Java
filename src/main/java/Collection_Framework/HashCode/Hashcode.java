package Collection_Framework.HashCode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Hashcode {
    static BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
        System.out.println("enter the String : ");
        String data=predator.readLine();
        System.out.println(data.hashCode());
        int sum=0;
        int length=data.length()-1;
        for (int i=0;i<data.length();i++){
            int ascii=data.charAt(i);
            sum+=ascii*Math.pow(31,length--);
        }
        System.out.println("The Hash code value is  : "+sum);
    }
}
