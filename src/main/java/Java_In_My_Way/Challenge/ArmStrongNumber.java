package Java_In_My_Way.Challenge;

public class ArmStrongNumber {
    public static void main(String[] args){
        System.out.println(isTrue(53));
    }
    static int power(int n){
        int base=0;
        while(n!=0){
            base++;
            n/=10;
            System.out.println(base);
        }
        return base;
    }
    static boolean isTrue(int n){
        int temp=n;
        int power=power(n);
        int sum=0;
        while(n!=0){
            int remainder=n%10;
            sum+=(double)(Math.pow(remainder,power));
            n/=10;
        }
        return sum==temp?true:false;
    }
}
