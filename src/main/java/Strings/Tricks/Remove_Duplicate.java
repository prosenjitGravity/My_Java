package Strings.Tricks;
 import java.util.Scanner;
public class Remove_Duplicate {
    public static void main(String[] args){
        System.out.println("enter the String :");
        Scanner predator=new Scanner(System.in);
        String data=predator.nextLine();
        System.out.println(data+" -> "+remove(data));
    }
    static  String remove(String s){
        String  collect="";
        for(int i=0;i<s.length();i++){
            int j;
            for(j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
            }
            if(i==j){
                collect+=s.charAt(i);
            }
        }
        return collect;
    }
}
