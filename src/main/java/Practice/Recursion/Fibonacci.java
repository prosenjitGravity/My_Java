package Practice.Recursion;

public class Fibonacci {
    public static void main(String[] java){
        int a=0,b=1,c=0;
        for (int i=0;i<8;i++){
            a=b;
            b=c;
            c=a+b;
//            System.out.println(c);
        }
        System.out.println(c);
    }
}
