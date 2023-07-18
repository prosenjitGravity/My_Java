package Sorting_Algorithm;
import java.util.ArrayList;
import java.util.List;
public class All_Duplicate_Number {
    public static  List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        List<Integer> list=new ArrayList<>();
            for(int index=0;index<nums.length;index++) {
                if (nums[index] != index + 1) {
                    list.add(nums[index]);
                }
            }
        return list;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
}
