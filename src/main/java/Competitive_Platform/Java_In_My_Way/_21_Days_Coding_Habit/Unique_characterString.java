package Competitive_Platform.Java_In_My_Way._21_Days_Coding_Habit;

import java.util.HashSet;

public class Unique_characterString {
    public static void unique_Character(String data) {
        boolean visited;
        String store = "";
        for (int i = 0; i < data.length(); i++) {
            visited = true;
            for (int j = 0; j < data.length(); j++) {
                if (data.charAt(i) == data.charAt(j) && j != i) {
                    visited = false;
                    break;
                }
            }
            if (visited) {
                store += data.charAt(i);
            }
        }
        System.out.println(store);

    }
    public static void unique_Character2(String data) {
        String store = "";
        for (int i = 0; i < data.length(); i++) {
            int j;
            for (j = 0; j < data.length(); j++) {
                if (data.charAt(i) == data.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                store += data.charAt(i);
            }
        }
        System.out.println(store);

    }
//    process_2

    public static int unique(String str){
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        unique_Character("azxxzy");
//        System.out.println(unique("session"));
    }
}
