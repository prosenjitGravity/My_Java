package HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> Map = new HashMap<String, Integer>();
        Map.put("Prosenjit", 101);
        Map.put("Abhishik", 102);
        Map.put("Sathi", 103);
        System.out.println(Map);
        if (Map.containsKey("Prosenjit")) {
            Integer value = Map.get("Prosenjit");
            System.out.println(value);
        }
    }
}
