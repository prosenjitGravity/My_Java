package PsudeCode;

public class psudo11 {
    public static void main(String[] args) {
        System.out.println(fun(0,0));
    }
    static int fun(int a,int b){
        if ((6-a)>(a-b)&& 1>b){
            b=1+2+b;
            a=b+3;
            return 1+fun(a+1,b+2)+2;
        }
        return a-b+1;                // output: 6
    }
}
