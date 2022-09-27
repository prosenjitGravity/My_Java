package OrganizationS_Zone.TCS;

public class DuplicateNumber {
    public static void main(String[] args){
        int[] arr=new int[]{10,20,30,40,10,30};
        int count=0;
        int start=0;
        int end= arr.length-1;
        while(start!=end){
            if(arr[start]==arr[end]){
                count++;
            }
            start++;
            end--;
        }
        System.out.println(""+count);
    }
}
