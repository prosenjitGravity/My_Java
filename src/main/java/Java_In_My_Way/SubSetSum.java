package Java_In_My_Way;

public class SubSetSum {
    public static void main(String[] args){
        int arr[]=new int[]{1,1,1};
        System.out.println(subarraySum(arr,2));
    }
//    static public int subarraySum(int[] nums, int k) {
//        int start=0;
//        return subset(nums,k,start);
//    }
    static int subset(int[] nums,int sum,int s){
        if(sum==0){
            return 1;
        }
        if(sum<0){
            return 0;
        }
        if(s==nums.length){
            return 0;
        }
        return subset(nums,sum-nums[s],s+1)+subset(nums,sum,s+1);
    }


    static public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){    // array length ==2;
            int sum=0;                    // sum==0
            for(int j=i;j<nums.length;j++){ // inner loop start with i=0
                sum+=nums[j];              // sum+=nums[j]--------------1
                if(sum==k){               // false,true
                    count++;             //count=0,
                }
            }
        }

        return count;
    }
}