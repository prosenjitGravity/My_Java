package OrganizationS_Zone.Google;

public class HappySubArray {
    public static void main(String[] args){
        int [] arr=new int[]{1,-2,3,-2,4};
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                count++;
            }
        }
        System.out.println(sum+" ");
    }
}
