package Practice.Recursion;

public class PrintNumber {
    public static void main(String[] args){
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(n);
        }
        print(n+1);
    }
}
