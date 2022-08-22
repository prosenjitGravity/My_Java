package PsudeCode;

public class psudo14 {
    public static void main(String[] args) {
        int p=1,q=2,r=10;
        if((p+r+q)>(q+p)){
            r=(4+1)+p;
        }else{
            r=(1+12)+r;
            if((p+r+q)<(q+p)){
                r=q+q;
                p=(8+5)+p;
            }
            r=(r+4)+p;
        }
        System.out.println((p+q+r));// output: 9
    }
}
