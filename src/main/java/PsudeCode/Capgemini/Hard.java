package PsudeCode.Capgemini;

public class Hard {
    public static void main(String[] args){
        int p=2,q=2;
        System.out.println(fun(p,q));
    }
    static int fun(int p,int q){
        if(p>0 && q>0){
            return fun(0,2+fun(0,22+fun(0,222+fun(0,222+fun(0,2222+fun(0,22222))))));
        }
        q=0;
        return p+q;
    }
}
