package Competitive_Platform.LeetCode.Medium;

public class kthFactor {
    public static void main(String[] args){
        System.out.println(factor(4,4));
    }
    static public int factor(int n,int k){
        int arr[]=new int[n];
        int count=0;
        int flag=0;
        if(n==k){
            return -1;
        }else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    arr[count++] = i;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (i == (k - 1)) {
                    flag = arr[i];
                }
            }
        }
        return flag;
    }// this code passes 162/208 test cases


    static public int kFactor(int n,int k){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
    }
}
//
/*
* public int kthFactor(int n, int k) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
    }
* */
