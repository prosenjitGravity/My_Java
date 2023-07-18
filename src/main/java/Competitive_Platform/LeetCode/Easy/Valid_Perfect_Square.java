package Competitive_Platform.LeetCode.Easy;

public class Valid_Perfect_Square {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
    public static boolean isPerfectSquare(int num) {
        int i=1;
        while(i*i!=num && i*i<=num && i<num){
            i++;
        }
        return i*i==num;
    }
}
