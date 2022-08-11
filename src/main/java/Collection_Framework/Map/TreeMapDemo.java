package Collection_Framework.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<String,Double> tm=new TreeMap<String ,Double>();
        tm.put("Jhon Doe",new Double(3434.34));
        tm.put("Tom Smith",new Double(123.22));
        tm.put("Jane Baker",new Double(1378.0));
        tm.put("Tod Hall",new Double(99.22));
        tm.put("Ralph Smith",new Double(-19.08));
        Set<Map.Entry<String,Double>>set=tm.entrySet();
        for (Map.Entry<String,Double> i:set){
            System.out.println(i.getKey()+" : "+i.getValue());
        }

    }
}
