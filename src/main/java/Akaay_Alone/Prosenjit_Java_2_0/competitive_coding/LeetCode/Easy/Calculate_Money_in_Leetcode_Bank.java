package Akaay_Alone.Prosenjit_Java_2_0.competitive_coding.LeetCode.Easy;

public class Calculate_Money_in_Leetcode_Bank {
    public static void main(String[] args){
        totalMoney(20);
    }
    static public void totalMoney(int n) {
        int day_count=1;
        int monday_increase=1;
        while(day_count <=n){
//            int day
            for(int i=monday_increase;i<=7;i++){
                System.out.print(i+", ");
                day_count++;
            }
            monday_increase++;

            System.out.println();
        }

    }
}
