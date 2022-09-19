package StringOperations;

import java.util.Scanner;

public class RemovingStar {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        String data=predator.nextLine();
        String r="";
        for(int i=0;i<data.length();i++){
            if(data.charAt(i)!='*'){
                r+=data.charAt(i);
            }
        }
        System.out.println(r);

    }
}
