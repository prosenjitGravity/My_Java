package PsudeCode;

public class psudo13 {
    public static void main(String[] args) {
        int p=9,q=8,r=9;
        if((r&3)<q && (p&7)<r){
            q=8+q;
        }else{
            p=p+r;
        }
        p=(11+2)+p;
        System.out.println((p+q+r));// output: 47
    }
}
