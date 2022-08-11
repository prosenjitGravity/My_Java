package Practice.Recursion;

public class FiboNumber {
    public static void main(String[] args){
        int req=fibo(50);
        System.out.println(req);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}
