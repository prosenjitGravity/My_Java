package PsudeCode;

public class psudo7 {
    public static void main(String[] args) {
        int p=9,q=4,r=6;
        r=(r^p)^q;
        q=(p+q)&p;
        System.out.println((p+q+r)); // output: 29
    }
}
