package Competitive_Platform.LeetCode.Easy;

public class Happy_Number {
    public static void main(String[] args){
        System.out.println(isHappy(4));
    }
    static  public boolean isHappy(int n) {
        return remainder(n);
    }
    static boolean remainder(int x){
        int sum=0;
        while(x!=0){
            int rem=x%10;
            sum+=Math.pow(rem,2);
            x/=10;
        }
        System.out.println("sum : "+sum);
        if(sum==1 ){
            return true;
        }else if(sum==4){
            return false;
        }
        return remainder(sum);
    }
}
