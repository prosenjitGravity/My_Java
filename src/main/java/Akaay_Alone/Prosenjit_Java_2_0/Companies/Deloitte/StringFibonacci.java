package Akaay_Alone.Prosenjit_Java_2_0.Companies.Deloitte;

import static Akaay_Alone.Prosenjit_Java_2_0.ReadInput.read_Input;
public class StringFibonacci {
    public static void main(String[] args){
        System.out.println("Enter the  word : ");
        String str=read_Input();
        System.out.println(word_fibo(str));

    }
    static String word_fibo(String str){
        int a=0, b=1,c=0, sum=0;
//        String letter="";
        for(int i=0;i<str.length();i++){
            a=b;
            b=c;
            c=a+b;
            sum+=c;
//            letter=letter+sum+""+str.charAt(i)+c; not working
        }
//        System.out.println("letter : "+letter);
        String letter_fibo =sum+"";
        int x=0,y=1,z=0;
        for(int j=0;j<str.length(); j++){
            x=y;
            y=z;
            z=x+y;
            letter_fibo=letter_fibo+str.charAt(j)+z;
        }
//        System.out.println("the sum is  : "+letter_fibo);
        return letter_fibo;
    }
}
