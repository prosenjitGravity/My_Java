package Collection_Framework.ArrayList_Collection;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> alist=new ArrayList<Integer>();
        alist.add(10);
        System.out.println("The arrayList is  : "+alist);
        alist.add(20);
        alist.add(30);
        alist.add(40);
        System.out.println(""+alist);
        alist.removeAll(alist);
        System.out.println(alist);
    }
}
