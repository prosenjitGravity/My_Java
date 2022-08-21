package Aptitude.QTA;

public class DifferenceSum {
    public static void main(String[] args){
        difSum(20,4);
    }
    static void difSum(int m,int n){
        int sum1=0,sum2=0,count1=0,count2=0;
        for (int i=1;i<=m;i++){
            if(i%n==0){
                sum1=sum1+i;
                count1++;
            }
            else{
                sum2=sum2+i;
                count2++;
            }
        }
        System.out.println("1st : "+sum1+" count : "+count1);
        System.out.println("2st : "+sum2+" count : "+count2);
        if(sum1>sum2){
            System.out.println((sum1-sum2));
        }else{
            System.out.println((sum2-sum1));
        }
    }
}
