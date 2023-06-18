package Java_In_My_Way.Challenge;

public class Divisible {
    public static void main(String[] args){
        System.out.println(isDivisible(6,30));
    }
    static int isDivisible(int n ,int m){
        int inD=0,notD=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                inD+=i;
            }else {
                notD+=i;
            }
        }
        return inD<notD? notD-inD:inD-notD;
    }
}
