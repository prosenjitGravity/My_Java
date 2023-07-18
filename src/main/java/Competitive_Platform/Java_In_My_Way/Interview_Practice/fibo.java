package Competitive_Platform.Java_In_My_Way.Interview_Practice;

public class fibo {
    public static void main(String[] args) {
//        fibo_brute(10);
        System.out.println(fibo_recursion(5));
        fibo_recursion(5);
    }
    static void fibo_brute(int n){
        int a=0,b=1,c=0;
        for(int i=0;i<n;i++){
            System.out.print(c+",");
            a=b;
            b=c;
            c=a+b;
        }
    }
    static int fibo_recursion(int n){
        if(n<2){
            return n;
        }
        int first=fibo_recursion(n-1);
        int last=fibo_recursion(n-2);
        return first+last;
    }
}
