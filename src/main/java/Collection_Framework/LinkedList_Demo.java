package Collection_Framework;

import java.util.LinkedList;

public class LinkedList_Demo {
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        ll.add(55);
        ll.add(66);
        ll.add(77);
        ll.add(88);
        ll.add(99);
        System.out.println(ll);
        ll.addFirst(110);
        System.out.println(ll);
        ll.add(4,456);
        ll.remove(0);
        ll.remove();
        ll.remove();
        ll.remove();
        ll.remove();
        ll.remove();
        ll.remove();
        ll.remove();
        ll.remove();
        ll.remove();
        ll.remove();
        System.out.println(ll.isEmpty());
        System.out.println(ll);
    }
}
