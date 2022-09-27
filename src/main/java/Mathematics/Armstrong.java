package Mathematics;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Armstrong {
    public static void main(String[] args)throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number : ");
        int n=Integer.parseInt(predator.readLine());
        int temp=n;
        int temp1=n;
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count);
        int sum=0;
        while(temp>0){
            int remainder=temp%10;
            sum=sum+(int)Math.pow(remainder,count);
            temp/=10;
        }
        System.out.println(sum);
        if(sum==temp1){
            System.out.println(sum+" Armstrong number");
        }else{
            System.out.println(sum+" Not a Armstrong Number");
        }
    }
}
