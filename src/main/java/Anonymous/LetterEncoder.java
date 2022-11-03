package Anonymous;
import java.util.Scanner;
public class LetterEncoder {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter the String data : ");
        String s=predator.nextLine();
        char ch=' ';
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                if(count!=0){
                    System.out.print(ch+""+count);
                }
                ch=s.charAt(i);
                count=1;
            }else{
                count++;
            }
        }
        System.out.println(ch+""+count);
    }
}
