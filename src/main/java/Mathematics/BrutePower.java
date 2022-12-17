package Mathematics;

public class BrutePower {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    static int power(int b,int ex){
        int sum=1;
        for(int i=1;i<=ex;i++){
            sum*=b;
        }
        return sum;
    }
}
