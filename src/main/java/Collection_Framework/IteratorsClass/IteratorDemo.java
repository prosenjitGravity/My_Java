package Collection_Framework.IteratorsClass;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerlist = new ArrayList<Integer>();
        integerlist.add(100);
        integerlist.add(200);
        integerlist.add(300);
        integerlist.add(400);
        integerlist.add(500);
        integerlist.add(600);
        integerlist.add(700);
        integerlist.add(800);
        System.out.println("Original content of integer arraylist : " + integerlist);
        //Using iterator to display the arraylist content.
        Iterator<Integer> itr = integerlist.iterator();
        while (itr.hasNext()) {
            int element = itr.next();
            System.out.println(element + " ");
        }

    }
}
