package SubArray;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args)throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first string : ");
        String s1=predator.readLine();
        System.out.println("Enter the second string : ");
        String s2=predator.readLine();
        System.out.println(isAnagram(s1,s2)+" Anagram");
        System.out.println(isAnagram2(s1,s2));
    }
    public static boolean isAnagram(String info1, String info2){
        char arr1[]=info1.toCharArray();
        char arr2[]=info2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(info1.length()!=info2.length()){
            return false;
        }else{
            for(int i=0;i<info1.length();i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
    //***********************************// Second Approach \\**************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    static boolean isAnagram2(String d1, String d2){
        if(d1.length()!=d2.length()){
            return false;
        }else {
            characterSorting(d1);
            characterSorting(d2);
            for(int i=0;i<d1.length();i++){
                if(d1.charAt(i)!=d2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    static void characterSorting(String arr){
        byte[] character=arr.getBytes();
        for(int i=0;i< character.length;i++){
            for(int j=0;j<character.length-i-1;j++){
                if(character[j]>character[j+1]){
                    int temp=character[j];
                    character[j]=character[j+1];
                    character[j+1]=(byte)temp;
                }
            }
        }
        for (byte i:character) {
            char c=(char)i;
            System.out.print(c+" ");
        }
    }

}
