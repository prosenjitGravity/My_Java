package BitManipulation;

public class SingleNumber {
    public static void main(String[] args){
        int arr[]=new int[]{4,1,2,1,2};
        System.out.println(arr);
    }
    public int sNumber(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum^=nums[i];
            System.out.println(sum);
        }
        return sum;
    }
}
