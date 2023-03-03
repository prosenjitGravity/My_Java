package In_My_Way;

public class AnaGram {
    public static void main(String[] args) {
        System.out.println(isAnagram("silent", "listen"));
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        byte[] arr1 = s1.getBytes();
        byte[] arr2 = s2.getBytes();
        Sorting(arr1);
        Sorting(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if ((char) arr1[i] != (char) arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static byte[] Sorting(byte arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    byte temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
