package Practice.Recursion;

public class Palindrome {
    public static void main(String[]  args){
        check(101);
        System.out.println(sum);
    }
    static int sum=0;
    static void  check(int n){
        if (n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        check(n/10);
    }
}
