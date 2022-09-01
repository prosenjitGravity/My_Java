package StringOperations;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "bdca";
        boolean isTrue = false;
        boolean visited[] = new boolean[b.length()];
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                isTrue = false;
                for (int j = 0; j < b.length(); j++) {
                    if (a.charAt(i) == b.charAt(j) && !visited[j]) {
                        visited[j] = true;
                        isTrue = true;
                        break;
                    }
                }
                if (!isTrue) {
                    break;
                }
            }
        }
        if (isTrue) {
            System.out.println("Anagram " + isTrue);
        } else {
            System.out.println("Anagram " + isTrue);
        }
    }
}
