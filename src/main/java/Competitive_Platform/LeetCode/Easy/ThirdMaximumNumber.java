package Competitive_Platform.LeetCode.Easy;
import static java.lang.System.out;
public class ThirdMaximumNumber {
    static public int thirdMax(int[] nums) {
        int f_max=0;
        int s_max=0;
        int t_max=0;
        for(int i=0;i<nums.length;i++){
            if(f_max<nums[i]){
                f_max=nums[i];
            } else if (f_max>nums[i] && s_max<nums[i]) {
                s_max=nums[i];
            }else if(s_max>nums[i] && t_max<nums[i]){
                t_max=nums[i];
            }
        }
        return (t_max==0 ? f_max : t_max);
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,2};
        out.println(thirdMax(arr));
    }
}
