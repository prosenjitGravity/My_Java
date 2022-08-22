package PsudeCode;

public class Psudo2 {
    public static void main(String[] args){
        int p=1,q=2,r=9;
        if((q&p&r)<(p+q-r)){
            q=5^r;
        }
        if((p^q^r)<(p^q^6)){
            q=(r+10)+10;
            p=5&p;
        }
        System.out.println((p+q+r)); // output: 12
    }
}
