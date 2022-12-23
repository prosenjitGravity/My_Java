package Exception_Handling.FileHandling;

import java.io.Console;

public class ConsloeDemo {
    public static void main(String[] args){
        String str="";
        Console console;
        console=System.console();
        if(console!=null){
//             System.out.println("Empty");
            str=console.readLine("enter string here : ");
        }
//        str=console.readLine("enter string here : ");
        console.printf("Here is your string : %s\n "+str);
    }
}
