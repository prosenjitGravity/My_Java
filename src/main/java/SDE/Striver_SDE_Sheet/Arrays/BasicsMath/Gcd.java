package SDE.Striver_SDE_Sheet.Arrays.BasicsMath;

public class Gcd {
    public static void main(String[] args){
        int n1=3,n2=6,result=1;
        for (int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                result=i;
            }
        }
        System.out.println(n1+","+n2+" GCD is  : "+result);
    }
}
