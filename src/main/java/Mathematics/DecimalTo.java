package Mathematics;

public class DecimalTo {
    public static void main(String[] args){
         int n=10,i=0;
         int binary[]=new int[32];
         while(n>0){
             binary[i]=n%2;
             n=n/2;
             i++;
         }
         for (int j=i-1;j>=0;j--){
             System.out.print(binary[j]);
         }
    }
}
