package Practice.Recursion;

public class Name {
    static void print(int n){
        if (n==0){
            return ;
        }

        System.out.println("Prosenjit");
        print(n-1);
    }
    public static void main(String[] args){
        print(5);
    }
}
