package Collection_Framework.HashMaps;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args){
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(101,"Google");
        hashMap.put(102,"Microsoft");
        hashMap.put(103,"Atlassian");
        hashMap.put(104,"IBM");
        hashMap.put(102,"Morgan Stanley");
        System.out.println(hashMap.values());
        for (Map.Entry<Integer,String> entry:hashMap.entrySet()){
            System.out.println("key "+entry.getKey()+" ->  value "+entry.getValue());
        }
        System.out.println(hashMap);
    }
}
