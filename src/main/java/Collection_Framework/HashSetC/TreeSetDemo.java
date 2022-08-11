package Collection_Framework.HashSetC;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> tree=new TreeSet<String>();             // TreeSet<> Stored its element in a tree they are
        tree.add("Hundred");                                    //automatically arranged in sorted order as the output confirm.
        tree.add("Two Hundred Fifty");
        tree.add("Seven Hundred");
        tree.add("Four Hundred");
        tree.add("Eight Hundred");
        tree.add("Three Hundred");
        System.out.println(tree);

    }
}
