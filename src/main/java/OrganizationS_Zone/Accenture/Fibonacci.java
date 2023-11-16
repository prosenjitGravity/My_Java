package OrganizationS_Zone.Accenture;

public class Fibonacci {
    public static void main(String[] args) {

        fibo(5);
    }
    static void fibo(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
