package PsudeCode;

public class psudo6 {
    public static void main(String[] args) {
        System.out.println(fun(9,8));
    }
    static int  fun(int a ,int b){
        if((a-5)>(b^a)&&(b-a)<(a^b)){
            a=a+2;
            b=b+3;
            a=3+1+b;
            return fun(b+1,b)+fun(a,a);
        }
        a=(b+1)+a;
        return b-a;// output: -29
    }
}
