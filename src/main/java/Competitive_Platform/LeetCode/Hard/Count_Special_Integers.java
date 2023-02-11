package Competitive_Platform.LeetCode.Hard;

public class Count_Special_Integers {
    public static void main(String[] args) {
        System.out.println(countSpecialNumbers(135));
    }
    static  public int countSpecialNumbers(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if (i>9 && i==interchange(i)){
                System.out.println("i : "+i);
                count++;
            }
        }
        return n-count;
    }
    static int interchange(int num){
        int sum=0;
        while(num!=0){
            int remainder=num%10;
            num/=10;
        }
        return sum;
    }
}
