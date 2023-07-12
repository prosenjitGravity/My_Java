package Recursion;

public class Sum_of_n {
    public static void main(String[] args) {

        System.out.println(n_number(10));
    }
    static int n_number(int n){
        if(n==0){
            return n;
        }
        return n+n_number(n-1);
    }
}
