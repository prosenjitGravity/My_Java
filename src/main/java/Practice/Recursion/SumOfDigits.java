package Practice.Recursion;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.println(SumDigit(123));
    }
    static int SumDigit(int n){
        int sum=0;
        if (n==0){
            return 0;
        }
        return (n%10)+SumDigit(n/10);

    }
}
