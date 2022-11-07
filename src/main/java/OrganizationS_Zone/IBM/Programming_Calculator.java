package OrganizationS_Zone.IBM;

interface Binary{
    int Binary_to_decimal();
    int Binary_to_Octal();
}
interface Decimal extends Binary{
    int Decimal_to_Binary();
    int Decimal_to_Octal();
}
interface Octal extends Decimal {
    int Octal_to_Binary();
    int Octal_to_Decimal();
}
class allMethods implements Octal{
    int number;
    public allMethods(int number){
        this.number=number;
    }

//    @Override
    public int Binary_to_decimal() {
        int sum=0,power=0;
        while(number!=0){
            int rem=number%2;
            sum+=(rem*Math.pow(2,power++));
            this.number/=10;
        }
        return sum;
    }

    @Override
    public int Binary_to_Octal() {
        System.out.println("H : "+Binary_to_decimal());
        return 0;
    }

    @Override
    public int Decimal_to_Binary() {
        System.out.println(this.number);
        return 0;
    }

    @Override
    public int Decimal_to_Octal() {
        return 0;
    }

    @Override
    public int Octal_to_Binary() {
        return 0;
    }

    @Override
    public int Octal_to_Decimal() {

        return 0;
    }
}
public class Programming_Calculator {
    public static void main(String[] args){
        allMethods all=new allMethods(101);
        System.out.println(all.Binary_to_decimal());
        System.out.println(all.Binary_to_Octal());
    }
}
