package OrganizationS_Zone.Practice.PsudeCode;

public class psudo16 {
    public static void main(String[] args) {
        System.out.println(fun(7,2));
    }
    static int fun(int a,int b){
        if(b>a && (b-a)<(a-b)){
            a=2+2+b;
            a=a+1;
            a=b+1;
            return a-fun(b,b);
        }
        a=2+2+a;
        return a+b-1;// output : 12
    }
}
