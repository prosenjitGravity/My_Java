package StringOperations;

public class OneArrayAnagram {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "elloh";
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        System.out.println(isAnagram(ch1, ch2));
    }

    static boolean isAnagram(char[] a, char[] b) {
        int length = 256;
        int count[] = new int[length];
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
            count[b[i]]--;
        }
        for (int i = 0; i < length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
