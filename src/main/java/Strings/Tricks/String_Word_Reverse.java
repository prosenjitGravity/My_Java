package Strings.Tricks;


/*
*  input : "the sky is blue"
*  output: blue is sky the
* */


import java.util.StringTokenizer;

public class String_Word_Reverse {

    public static void main(String[] args){
        System.out.println("'  hello world  ' After reverse  : ");
        System.out.println("'"+getReverse("a good   example")+"'");
    }
    static String getReverse(String str){
        String concatenate="";
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            concatenate+=arr[i];
            if(i>0){
                concatenate+=" ";
            }
        }
        return concatenate.trim();
    }


}
