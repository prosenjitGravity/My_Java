package Java_Features.NewRules;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CharacterCount {
    public static void main(String[] args) throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String : ");
        String data=predator.readLine();
        System.out.println("First Approach");
        LetsCount(data);
        System.out.println("Second Approach");
        LetsCount1(data);

    }
    static void LetsCount(String str){                  // Process 1 break String into a character array
        char[] letter=str.toCharArray();
        int start=0;
        char temp=0;
        int count=0;
        while(start<letter.length){
            if(temp!=letter[start]){
                if(count!=0){
                    System.out.print(temp+""+count);
                }
                temp=letter[start];
                count=1;
            }else{
                count++;
            }
            start++;
        }
        System.out.print(temp+""+count);
    }
    static void LetsCount1(String str){               // Process 2 Don't use array ,break String into built in methode  like charAt()
        char ch=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch!=str.charAt(i)){
                if(count !=0){
                    System.out.println(ch+""+count);
                }
                ch=str.charAt(i);
                count=1;
            }else{
                count++;
            }
        }
        System.out.println(ch+""+count);
    }
}
