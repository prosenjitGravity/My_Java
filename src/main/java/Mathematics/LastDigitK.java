package Mathematics;

public class LastDigitK {
    public static void main(String[] args){
        System.out.println(Count(1,9,0));
    }
    public static int Count(int A,int b,int c){
        int count=0;
        for (int i=A;i<=b;i++){
            if(i%10==c){
                count++;
            }
        }
        return count;
    }
}
