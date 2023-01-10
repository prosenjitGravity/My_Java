package Competitive_Platform.LeetCode;



/*
* Input: num = 443
Output: true
Explanation: 172 + 271 = 443 so we return true.
* */

public class Sum_Of_number {
    public static void main(String args[]){
        System.out.println(sumOfNumber(63));
    }
    static int reverse(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum;
    }
    static boolean sumOfNumber(int num){
        for(int i=0;i<num;i++){
            if(i+reverse(i)==num){
                return true;
            }
        }
        return false;
    }
}
