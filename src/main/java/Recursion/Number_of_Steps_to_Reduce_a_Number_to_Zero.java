package Recursion;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        int ans = numberOfSteps(14);
        System.out.println(ans);
    }

    static public int numberOfSteps(int num) {
        final int count=0;
        return numberOf(num,count);
    }
    static int numberOf(int num,int count){
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return numberOf(num / 2,count+1);
        }
        return numberOf(num - 1,count+1);
    }
}
