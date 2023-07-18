package Sorting_Algorithm;
import java.util.ArrayList;
import java.util.List;
class DisappearedNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        List<Integer> alist=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                alist.add(j+1);
            }
        }
        return alist;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}