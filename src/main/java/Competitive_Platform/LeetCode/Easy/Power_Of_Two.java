package Competitive_Platform.LeetCode.Easy;

public class Power_Of_Two {
    public static void main(String[] args){

        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfThree(81));
    }
    static public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;
    }
    static public boolean isPowerOfThree(int n) {
        while(n>=3){
            if(n%3!=0){
                return false;
            }
            n/=3;
        }
        return n==1;
    }
}
