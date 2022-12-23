package OrganizationS_Zone.Practice.Brute_Force;

public class Fibonacci {
    public static void main(String[] args){
        int n=5;
        int a=0,b=1,temp;
        if(n==0){
            System.out.print(0+" ");
        }else {
            System.out.print(0+" ");
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                b = a;
                a = temp;
                System.out.print(temp+ " ");
            }
        }
    }
}
