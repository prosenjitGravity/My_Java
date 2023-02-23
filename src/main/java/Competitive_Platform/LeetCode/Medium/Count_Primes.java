package Competitive_Platform.LeetCode.Medium;

public class Count_Primes {
    public static void main(String[] args){
        System.out.println(countPrimes(10));
    }
    static  public int countPrimes(int n) {
        int count=0;
        if(n==0||n==1||n==2){
            return 0;
        }else{
            for(int i=3;i<=n;i++){
                if(checkPrime(i)) {
//                    System.out.println(i + " : " + checkPrime(i));
                    ++count;
                }
            }
        }
        return count;
    }
    static boolean checkPrime(int num){
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
