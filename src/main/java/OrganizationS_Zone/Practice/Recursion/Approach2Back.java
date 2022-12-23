package OrganizationS_Zone.Practice.Recursion;

public class Approach2Back {
    static void print(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        print(i-1,n);
    }
    public static void main(String[] args){
        print(3,3);
    }
}
