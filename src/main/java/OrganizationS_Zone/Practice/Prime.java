package OrganizationS_Zone.Practice;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number you want : ");
        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            System.out.println(i+" : "+IsPrime(i));
//        }
        IsPrime(n);
//        isPrime(n);

    }
    static  void isPrime(int n){
        int count=0;
        for(int i=2;i<=n/2;i++){     // another is for(int i=1;i<=n;i++){
            if(n%i==0){                            // if(n%i==0){
               count=1;                                  // count++;
            }                                       //}
        }                                        //}
        if(count==0){                              // if(count==2{
            System.out.println(n+" is prime");       //   System.out.println(n+" is prime");
        }else{                                      //else{
            System.out.println(n+" is Not prime");     // System.out.println(n+" is Not prime");
        }                                          // }
    }
    static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
