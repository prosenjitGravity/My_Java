package ForEach;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class UsingArrayList {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(29);
        list.add(33);
        list.add(24);
        list.add(10);
        list.add(99);
        list.add(11);
        list.add(20);
        System.out.println(list);
        Collections.sort(list);
        list.forEach(e->{
           System.out.println(e);
        });
    }
}
