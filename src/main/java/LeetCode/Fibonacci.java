package LeetCode;

public class Fibonacci {
    public static void main(String[] args){
        int a=0,b=1,c = 0;
        for (int i=0;i<4;++i){
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
        System.out.println(c);
    }
}
