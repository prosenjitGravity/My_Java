package OrganizationS_Zone.Accenture;

public class DifferenceOfSum    {
    public static void main(String[] args){
        System.out.println(diff_Sum(6,30));

    }
    public static  int diff_Sum(int n , int m){
        int sum = 0;
        for(int i=n; i<=m;i=i+n){
//            System.out.println("i : "+i);
            sum+=i;
        }
        return sum;
    }
}
