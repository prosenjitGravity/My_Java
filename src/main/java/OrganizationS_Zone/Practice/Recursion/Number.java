package OrganizationS_Zone.Practice.Recursion;

public class Number {
    static int print(int i,int n){
        if(i==n){
            return i;
        }
        System.out.println(i);
        return  print(i+1,n);
    }
    public static void main(String[] args){
        System.out.println(print(1,100));
    }
}
