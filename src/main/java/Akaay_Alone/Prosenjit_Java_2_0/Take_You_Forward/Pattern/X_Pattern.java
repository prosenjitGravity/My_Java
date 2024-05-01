package Akaay_Alone.Prosenjit_Java_2_0.Take_You_Forward.Pattern;

import static Akaay_Alone.Prosenjit_Java_2_0.ReadInput.read_Input;

public class X_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number  : ");
        int num = Integer.parseInt(read_Input());
        pattern((num*2)-1);
    }

    static void pattern(int n) {
        int a = 0 ,b=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    if(j <=(n/2)){
                        System.out.print(++a+" ");
                    }else{
                        System.out.print(--a+" ");
                    }

                } else if (j== (n-i)-1) {
                    if(j >= (n/2)){
                        System.out.print(++b+" ");
                    }else{
                        System.out.print(b--+" ");
                    }

                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
