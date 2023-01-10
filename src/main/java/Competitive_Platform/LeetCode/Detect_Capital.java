package Competitive_Platform.LeetCode;

public class Detect_Capital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("ggg"));
    }

    public static boolean detectCapitalUse(String word) {
        boolean[] isCheck = new boolean[word.length()];
        if (word.length() == 1) {
            return true;
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    isCheck[i] = true;
                } else {
                    isCheck[i] = false;
                }
            }
        }
        return isTrue(isCheck);
//        int uppercase = 0;
//        for (char ch : word.toCharArray()) {
//            if (Character.isUpperCase(ch)) {
//                uppercase++;
//            }
//        }
//        if (uppercase == word.length() || uppercase == 0) {
//            return true;
//        } else if (uppercase == 1 && Character.isUpperCase(word.charAt(0))) {
//            return true;
//        }
//        return false;
    }

    static boolean isTrue(boolean[] check) {
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                return false;
            }
        }
        return true;
    }
}
