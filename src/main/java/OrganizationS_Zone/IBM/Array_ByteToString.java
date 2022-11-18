package OrganizationS_Zone.IBM;

import java.util.Scanner;

public class Array_ByteToString {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        byte[] arr=new byte[]{100,98,96,103,101,116,89,108,109,110};
        System.out.println("convert byte array to string : "+getString(arr));

    }
    static String getString(byte[] bytes){
        char ch='0';
        String s="";
        for(int i=0;i<bytes.length;i++){
            ch= (char) bytes[i];
            s+=ch;
        }
        return s;
    }

}
