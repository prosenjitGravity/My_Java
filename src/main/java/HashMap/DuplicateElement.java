package HashMap;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args){
        remove("madam");
    }
    static void remove(String s){
        char[] arr=s.toCharArray();
        HashSet<Character> hs=new HashSet<>(arr.length-1);
        for (int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for (Character i:hs){
            System.out.println(i);
        }
    }
}
