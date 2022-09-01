package SDE.Striver_SDE_Sheet.Arrays.BasicsMath;

public class ReverseInteger {
    public static void main(String[] args){
        int number=123;
        int sum=0;
        while(number>0){
            int remainder=number%10;
            sum=sum*10+remainder;
            number=number/10;
        }
        System.out.println(sum);
    }
}
