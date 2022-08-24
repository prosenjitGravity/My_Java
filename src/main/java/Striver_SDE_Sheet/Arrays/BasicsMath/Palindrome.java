package Striver_SDE_Sheet.Arrays.BasicsMath;

public class Palindrome {
    public static void main(String[] args){
        int n=123;
        int temp=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(sum+" is Palindrome : "+temp);
        }else{
            System.out.println(sum+" is Not Palindrome : "+temp);
        }
    }
}
