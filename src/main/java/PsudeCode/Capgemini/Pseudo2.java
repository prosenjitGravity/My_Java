package PsudeCode.Capgemini;

public class Pseudo2 {
    public static void main(String[] args) {
        int beg=5,end=7,sum=0,n;
        for ( n=end;n>=beg;n--){
            sum+=n;
            n=n-1;
        }
        System.out.println(n);
    }
}
