package Aptitude.QTA;
import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String data=predator.nextLine();
        LetsCount(data);
    }
    static void LetsCount(String str){
        char ch=' ';
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                if(count!=0){
                    System.out.print(ch+""+count);
                }
                ch=str.charAt(i);
                count=1;
            }else{
                count++;
            }
        }
        System.out.print(ch+""+count);
    }
}
