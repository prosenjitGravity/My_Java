package OrganizationS_Zone.TCS;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args){
        int n=10;
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
            System.out.print(a);
            if(i<n){
                System.out.print(",");
            }
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
