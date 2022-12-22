package Aptitude.QTA;

public class PrimeNumber {
    public static void main(String[] args){
        for(int i=0;i<20;i++){
            System.out.println(i+" "+isPrime(i));
        }
    }
    static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }else {
            int c=2;
            while(c*c<=n){
                if(n%c==0){
                    return false;
                }
                c++;
            }
        }
        return true;
    }
}
