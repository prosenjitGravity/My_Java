package OrganizationS_Zone.Practice.PsudeCode;

public class psudo8 {
    public static void main(String[] args) {
        System.out.println(fun(6,3,10));
    }
    static int fun(int a,int b,int c){
        if((c+b)+(b&a)>(c&b+a)){
            a=a+a;
        }else{
            c=(9+12)+a;
        }
        b=(7+2)+a;
        return a+b+c; // output: 43
    }

}
