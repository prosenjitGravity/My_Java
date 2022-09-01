package PsudeCode.Capgemini;

public class pseudo1 {
    public static void main(String[] args){
        int n=987;
        while(n!=0){
            int remainder=n%4;
            System.out.println(remainder);
            n=n/10;
        }
    }
}
