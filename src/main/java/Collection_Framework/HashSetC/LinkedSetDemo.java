package Collection_Framework.HashSetC;

import java.util.LinkedHashSet;

public class LinkedSetDemo {
    public static void main(String[] args){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        lhs.add(100);
        lhs.add(200);
        lhs.add(300);
        lhs.add(400);
        lhs.add(500);
        lhs.add(600);
        System.out.println(lhs);
    }
}
