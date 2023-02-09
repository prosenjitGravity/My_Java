package Aptitude;

public class Fibonacci_Trangle {
    public static void main(String[] args){
        int n=6;
        int a=0,b=1,c=0;
        for (int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.print(1+" ");
            for (int k=0;k<i;k++){
                System.out.print(b+" ");
                c=a+b;
                a=b;
                b=c;
//                System.out.print(b+" ");
            }
//            System.out.print(a+" ");
            System.out.println();
        }
    }
}
