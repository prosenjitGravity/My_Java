package OrganizationS_Zone.Practice.PsudeCode;

public class psudo3 {
    static int fun(int a,int b){
        if(1>b&& 4>b){
            a=(b+3)+a;
            a=2+a+a;
            b=1+1+b;
            return fun(a+1,b+1)+2+fun(a-1,a+1);
        }
        a=(a+2)+a;
        return a;
    }
    public static void main(String[] args) {
        int a=0,b=0;
        System.out.println(fun(a,b));
    }                                        // output: 38

}
