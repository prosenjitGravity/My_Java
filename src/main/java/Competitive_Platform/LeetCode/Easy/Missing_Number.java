package Competitive_Platform.LeetCode.Easy;

public class Missing_Number {
    public static void main(String[] args){
        System.out.println(missingNumber(new int[]{0,1}));
    }
    static int missingNumber(int[] nums){
        int nSum=0;
        int sum=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            nSum+=nums[i];
        }
        return nSum<sum ?sum-nSum:nSum-sum;
    }
//    static int missingNumber2(int [] nums){
//        for( int i=1;i<nums.length;i++){
//            int flag=0;
//            for(int j=0;j<nums.length-1;j++){
//                if(nums[j]==i){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0){
//                return i;
//            }
//        }
//    }
}
