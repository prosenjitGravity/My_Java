package Competitive_Platform.Ninja;

public class CodeKaze {
    public static void main(String[] args){
        System.out.println( maximumPower(5,new int[]{3 ,1 ,2 ,6 ,4}));
        System.out.println( maximumPower(4,new int[]{5,0,2,1}));
    }
    public static long maximumPower(int n, int []a) {
        // Write your code here.
        int multiply = 1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                multiply=a[i]*a[j];
            }
        }
        return multiply;
    }
}
