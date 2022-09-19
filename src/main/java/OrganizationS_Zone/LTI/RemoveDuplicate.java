package OrganizationS_Zone.LTI;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args){
        duplicate("Hello");
    }
    static void duplicate(String s){
        LinkedHashSet<Character>lhs=new LinkedHashSet<Character>();
        for (int i=0;i<s.length();i++){
            lhs.add(s.charAt(i));
        }
        for (Character c: lhs){
            System.out.println(c);
        }
    }
}
