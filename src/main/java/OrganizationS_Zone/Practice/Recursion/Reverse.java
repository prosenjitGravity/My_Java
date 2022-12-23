package OrganizationS_Zone.Practice.Recursion;

public class Reverse {
    static int print(int n,int i){
        if(n==i){
            return n;
        }
        System.out.println(n);
        return print(n-1,i);
    }
    public static void main(String[] args){
        System.out.println(print(100,1));
    }
}
