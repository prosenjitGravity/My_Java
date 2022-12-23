package Strings.StringOperations;

public class AnagramApproach {
    public static void main(String[] args) {
        String s1 = "aapb";
        String s2 = "baba";
        boolean isTrue = true;
        int a[] = new int[256];
        int b[] = new int[256];
        for (char c : s1.toCharArray()) {
            int i = c;
            a[i]++;
//            System.out.println(a[i]);
        }
        for (char c : s2.toCharArray()) {
            int j = c;
            b[j]++;
//            System.out.println(b[j]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println("Anagram " + isTrue);
        } else {
            System.out.println("Anagram " + isTrue);
        }
    }
}
