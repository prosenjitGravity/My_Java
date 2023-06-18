package Competitive_Platform.LeetCode.Medium;

public class Divisible_by_k {
    public static void main(String[] args) {
        System.out.println(arrange(new int[]{1,2,3,4,5,10,6,7,8,9},5));
        System.out.println(arrange(new int[]{-1,1,-2,2,-3,3,-4,4},3));
    }
//    public boolean canArrange(int[] arr, int k){
//        return
//    }
    static boolean arrange(int array[] ,int k){
        for(int i=0;i<array.length/2;i++){
            int result=(array[i]+array[array.length-1-i]);
            System.out.println("result : "+result);
            if(result%k==0){
                return true;
            }
        }
        return false;
    }
}
