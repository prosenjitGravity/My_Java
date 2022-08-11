package Collection_Framework.VectorList;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector<String> vector= new Vector<String>();
        vector.add("Hello");
        vector.add("java");
        vector.add("collection");
        vector.add("using");
        vector.add("vector");
        System.out.println(vector);
        vector.addElement("new element");
        System.out.println(vector);
        String h= String.valueOf(vector.contains("vector"));
        System.out.println(h);


    }
}
