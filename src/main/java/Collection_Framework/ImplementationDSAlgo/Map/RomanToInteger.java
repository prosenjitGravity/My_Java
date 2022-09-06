package Collection_Framework.ImplementationDSAlgo.Map;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(convert("MCMXCIV"));

    }

    static int convert(String value) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
//            System.out.println(hm.get(value.charAt(i))+" < "+hm.get(value.charAt(i+1)));
            if ((i < value.length() - 1) && (hm.get(value.charAt(i)) < hm.get(value.charAt(i + 1)))) {
                sum += hm.get(value.charAt(i)) - hm.get(value.charAt(i));
                i++;
            } else {
                sum += hm.get(value.charAt(i));
            }
        }
        return sum;
    }
}
