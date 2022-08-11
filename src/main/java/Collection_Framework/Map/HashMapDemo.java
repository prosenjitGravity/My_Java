package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("Monday", new Integer(1));
        hm.put("Tuesday",new Integer(2));
        hm.put("wednesday",new Integer(3));
        hm.put("Thursday",new Integer(4));
        hm.put("Friday",new Integer(5));
        hm.put("Saturday",new Integer(6));
        hm.put("Sunday",new Integer(10));
        Set<Map.Entry<String, Integer>>set=hm.entrySet();
        for(Map.Entry<String,Integer> mew :set){
            System.out.println(mew.getKey()+" : "+ mew.getValue());
        }

        //updating : select key and update key value.
        Integer update=hm.get("Sunday");
        System.out.println("Updated value is  : "+update);
        hm.put("Sunday",update-2);
        System.out.println("Updated Value is : ");
        System.out.println("After updating : "  +hm.get("Sunday"));
    }
}
