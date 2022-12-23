package OrganizationS_Zone.Practice.Recursion;

public class FiboNumber {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.print(fibo(i));
            if(i<10-1){
                System.out.print(",");
            }
        }
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
