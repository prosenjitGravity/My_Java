package Collection_Framework.IteratorsClass;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        ArrayList<Integer> alist=new ArrayList<>();
        alist.add(100);
        alist.add(200);
        alist.add(300);
        alist.add(400);
        alist.add(500);
        alist.add(600);
        alist.add(700);
        alist.add(800);
        System.out.println(alist);
        ListIterator<Integer> listIterator= alist.listIterator();
        while(listIterator.hasNext()){
            int element=listIterator.next();
            System.out.println(element+"+ ");
        }
        while(listIterator.hasPrevious()){
            int element1= listIterator.previous();
            System.out.print(element1+"+ ");
        }
    }
}
