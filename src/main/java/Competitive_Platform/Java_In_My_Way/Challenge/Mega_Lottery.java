package Competitive_Platform.Java_In_My_Way.Challenge;

import java.util.ArrayList;
import java.util.Collections;

public class Mega_Lottery {
    private static boolean isPrime(int n){
        if(n==0||n==1) {
            return false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr=new int[]{13,18,1,3,4,5,50,29,30,41};
        int x=200;
        int count=0;
        int sumAllPrime=0;
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                sumAllPrime+=arr[i];
            }
        }
        System.out.println(sumAllPrime);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            int n=(sumAllPrime-i);
            if(!isPrime(n)){
                list.add(n);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=list.get(k);
                }
                if(sum<x){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
