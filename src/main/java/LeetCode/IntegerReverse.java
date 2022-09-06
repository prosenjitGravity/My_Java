package LeetCode;
import java.util.Scanner;
public class IntegerReverse {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        int x=predator.nextInt();
        int sum=0;
        if(x<0){
            while (x <0) {
                int remainder = x % 10;
                sum = sum * 10 + remainder;
                x = x / 10;
            }
        }else {
            while (x > 0) {
                int remainder = x % 10;
                sum = sum * 10 + remainder;
                x = x / 10;
            }
        }
        System.out.println(sum);
    }
    class Solution {
        public int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                rev = rev * 10 + pop;
            }
            return rev;
        }
    }
}
