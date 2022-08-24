package Striver_SDE_Sheet.Arrays.BasicsMath;

public class Divisor {
    public static void main(String[] args){
        int n=36;
        int  count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\n"+n+" Divisor is  : "+count);
    }
}
