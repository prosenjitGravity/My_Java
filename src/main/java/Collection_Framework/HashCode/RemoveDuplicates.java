package Collection_Framework.HashCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){
        System.out.println(remove("Hello"));
    }
    static HashSet<Character> remove(String data){
        HashSet<Character> rm= new HashSet<Character>();
        for(int i=0;i<data.length();i++){
            rm.add((data.charAt(i)));
        }
        return rm;
    }
}
