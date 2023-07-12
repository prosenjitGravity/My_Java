package Java_In_My_Way._21_Days_Coding_Habit;

import java.util.HashSet;

public class Unique_characterString {
    public static void unique_Character(String data) {
        boolean visited = true;
        String store = "";
        for (int i = 0; i < data.length(); i++) {
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
        System.out.println(unique("session"));
    }
}
