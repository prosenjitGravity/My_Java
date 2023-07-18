package Competitive_Platform.LeetCode.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Group_Anagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for (String s : strs) {
            char[] character = s.toCharArray();
            Arrays.sort(character);
            String sorted_character = String.valueOf(character);
            System.out.println("element sorting : " + sorted_character);
            if (!anagram.containsKey(sorted_character)) {
                anagram.put(sorted_character, new ArrayList<>());
            }
            anagram.get(sorted_character).add(s);
        }
        return new ArrayList<>(anagram.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

}
