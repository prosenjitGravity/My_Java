package Java_In_My_Way._21_Days_Coding_Habit;

import java.util.Scanner;

class ProblemSolving{
    int  solving(int arr[],int n,int t,int r){
        int p=0;
        while(p<t){
            int last=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=last;
            p++;
            display(arr);
            System.out.println("p : "+p);
        }

        int sum=0;
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            if(i<r){
                sum+=arr[i];
            }else{
                sum1+=arr[i];
            }
        }
        System.out.println("sum : "+sum+", sum1 : "+sum1);
        return sum>sum1?sum+sum1:sum1-sum;
    }
    void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class RotateArray {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("how many element you want : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter "+i+"th value : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter rotation : ");
        int t=sc.nextInt();
        System.out.println("enter target");
        int r=sc.nextInt();
        ProblemSolving ps=new ProblemSolving();
        System.out.println(ps.solving(arr,arr.length,t,r));
//        Athlete a=new Athlete();
//        a.display();
    }
}
//class Athlete {
//    Scanner as=new Scanner(System.in);
//    String athleteName;
//    public double athleteSpeed;
//    public int athleteAge;
//    void display(){
//        athleteAge=as.nextInt();
//        System.out.println(athleteAge);
//    }
//}