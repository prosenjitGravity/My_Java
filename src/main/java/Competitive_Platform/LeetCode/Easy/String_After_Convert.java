package Competitive_Platform.LeetCode.Easy;

public class String_After_Convert {
    public static void main(String[] args){
        getLucky("zbax");
    }
//    public int getLucky(String s, int k) {
//
//    }
    static public void getLucky(String s) {
        for(int i=0;i<s.length();i++){
            System.out.println((int)s.charAt(i)-96);
        }
    }
    static public int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if (sum / 10 == 0) {
            return sum;
        } else {
            return addDigits(sum);
        }
    }
}
