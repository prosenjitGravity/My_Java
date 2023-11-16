package OrganizationS_Zone.Accenture;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseNumber {
    static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        System.out.println("Enter the number : ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println(reverse(n));
    }
    static int reverse(int num){
        int rev = 0;
        while(num !=0){
            int rem = num %10;
            rev=rev*10 + rem;
            num/=10;
        }
        return rev;
    }
}
