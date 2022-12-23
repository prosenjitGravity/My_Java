package OrganizationS_Zone.Practice.PsudeCode;

public class psudo15 {
    public static void main(String[] args) {
        System.out.println(fun(8,0));
    }
    static int fun(int a,int b){
        if(4<a && (1^a)>(a+b)){
            b=(b+2)+a;
            b=a+1;
            return fun(a,b)+fun(a,b+a);
        }
        a=(b+3)+b;
        return a+b;// output: 84
    }
}
