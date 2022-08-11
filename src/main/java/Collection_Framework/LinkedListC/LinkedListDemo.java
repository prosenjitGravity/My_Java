package Collection_Framework.LinkedListC;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.add("Google");
        list.add("Microsoft");
        list.add("IBM");
        list.add("Atlassian");
        System.out.println("Create LinkedList : "+list);
        list.addFirst("Facebook");
        System.out.println("before insert beginning : "+list);
        list.addLast("Zycus");
        System.out.println("After insert last : "+list);
        list.removeFirst();
        System.out.println("Remove first element : "+list);
        list.removeLast();
        System.out.println("Remove Last element : "+list);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove("Microsoft");
        System.out.println(list);
        System.out.println("total element of LinkedList : "+list.size());
        String j=list.get(0);
        System.out.println("using get() method : "+j);
        System.out.println(list);
//        list.clear();
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);

    }
}
