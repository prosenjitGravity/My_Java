package SDE.Striver_SDE_Sheet;

import org.jetbrains.annotations.NotNull;

public class ReverseWord {
    public static void main(String[] args){
        String s="this is an amazing program";//     input : this is an amazing program
        System.out.println(s);               //      output : program amazing an is this
        String g=Reverse1(s);
        System.out.println(g);
    }
    static void Reverse( String s){

//        while(token.hasMoreTokens()){
//            System.out.println(token.nextToken());
//
//        }
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    static String Reverse1(String str){
        int start=0;
        int end=str.length();
        String temp="";
        String ans="";
        while(start<end){
            char ch=str.charAt(start);
            if(ch!=' '){
                temp+=ch;
            }else if(ch==' '){
                if(!ans.equals("")){
                    ans=temp+" "+ans;
                }else{
                    ans=temp;
                }
                temp="";
            }
            start++;
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans=temp+" "+ans;
            }else{
                ans=temp;
            }
        }
        return ans;
    }
}
