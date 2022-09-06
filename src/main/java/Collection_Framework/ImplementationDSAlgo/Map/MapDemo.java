package Collection_Framework.ImplementationDSAlgo.Map;
import java.util.HashMap;
public class MapDemo {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        System.out.println(map);
        System.out.println("Size of the map is  : "+map.size());

    }
}
