package OrganizationS_Zone.Practice.Recursion.Recursion;

public class PrintN {
    public static void main(String[] args){
        System.out.println(print(1,100));
        System.out.println(reverse(100,50));
    }
    static int print(int start,int end){
        if(start==end){
            return start;
        }
        System.out.println(start);
        return print(start+1,end);
    }
    static  int reverse(int start,int end ){
        if(start==end){
            return start;
        }
        System.out.println(start);
        return reverse(start-1,end);
    }
}
