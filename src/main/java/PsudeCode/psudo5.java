package PsudeCode;

public class psudo5 {
    public static void main(String[] args) {
        int pp=3,qq=8,rr=6;
        for ( rr=5;rr<=8;rr++){
            if((qq+pp)>(pp+qq)){
                continue;
            }
            qq=1+rr;
        }
        System.out.println((pp+qq));// output: 12
    }
}
