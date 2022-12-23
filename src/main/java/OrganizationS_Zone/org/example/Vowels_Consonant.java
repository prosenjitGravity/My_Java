package OrganizationS_Zone.org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Vowels_Consonant {
    public static void main(String[] args)throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the String data : ");
        String data=predator.readLine();
        System.out.println("The data '"+data+"' have : "+Count_Vowels_Consonant(data));
    }
    static String  Count_Vowels_Consonant(String str){
        String s=str.toLowerCase();

        int v=0,c=0;
        String collect1="",collect2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                collect1+=s.charAt(i);
                v++;
            }else{
                collect2+=s.charAt(i);
                c++;
            }
        }
        return v+" Vowels is '"+collect1+"'  &  "+c+" Consonant is '"+collect2+"'";
    }
}
