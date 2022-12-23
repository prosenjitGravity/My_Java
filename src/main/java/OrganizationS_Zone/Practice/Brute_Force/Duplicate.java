package OrganizationS_Zone.Practice.Brute_Force;

public class Duplicate {
    public static void main(String[] args){
        int count=0;
        int arr[]=new int[]{2,4,9,5,6,3,9,8,7,9,1};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.println();
        if (count==0){
            System.out.println("Duplicate number Not found");
        }else{
            System.out.println(count+" Duplicate number Found ");
        }
    }
}