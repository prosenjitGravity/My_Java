package Akaay_Alone.Prosenjit_Java_2_0.Take_You_Forward.Pattern;

import static Akaay_Alone.Prosenjit_Java_2_0.ReadInput.read_Input;

public class pattern_2 {
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        int num = Integer.parseInt(read_Input());
        pattern_1(num);
        pattern_2(num);
        pattern_3(num);
        pattern_4(num);
        pattern_5(num);
        pattern_6(num);
        fibo_Pattern(num);

    }
    static void pattern_1(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern_2(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
    static void pattern_3(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
    static void pattern_4(int num){
        char ch='A';
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print( ch+++" ");
            }
            System.out.println();
        }
    }
    static void pattern_5(int num){
        char ch='A';
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print( ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
    static void pattern_6(int num){
        int n=1;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print( n+++" ");
            }
            System.out.println();
        }
    }
    static void fibo_Pattern(int num){
        int a=0,b=1,c=0;
        for(int i =0;i<num;i++){
            a=b;
            b=c;
            c=a+b;
            for(int j=0; j<i;j++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }


}
