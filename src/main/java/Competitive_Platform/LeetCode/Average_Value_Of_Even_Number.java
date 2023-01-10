package Competitive_Platform.LeetCode;

public class Average_Value_Of_Even_Number {
    public static void main(String[] args){
        System.out.println(averageValue(getArray()));
    }
    static public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int i=1;i<nums.length;i++){
            if(i%6==0){
                sum+=nums[i];
                count++;
            }
        }
        return count==0? 0:(sum/count);
    }
    static int[] getArray(){
        return new int[]{1,2,4,7,10};
    }
}
