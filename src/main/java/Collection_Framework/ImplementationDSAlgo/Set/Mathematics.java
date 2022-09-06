package Collection_Framework.ImplementationDSAlgo.Set;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class Mathematics {
    public static void main(String[] args){
        Set<Integer>s=new HashSet<Integer>();
        s.addAll(Arrays.asList(new Integer[]{ 1, 3, 2, 4, 8, 9, 0 }));


        Set<Integer>s1=new HashSet<Integer>();
        s1.addAll(Arrays.asList(new Integer[]{ 1, 3, 7, 5, 4, 0, 7, 5 }));


        Set<Integer> union=new HashSet<Integer>(s);
        union.addAll(s1);
        System.out.println(union);

        Set<Integer> intersection=new HashSet<Integer>(s);
        intersection.retainAll(s1);
        System.out.println(intersection);

        Set<Integer> different=new HashSet<Integer>(s);
        different.removeAll(s1);
        System.out.println(different);
    }
}
