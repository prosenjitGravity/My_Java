package OrganizationS_Zone.Practice.Brute_Force;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args){
        String s="HelloJava";
        char[] arr=s.toCharArray();
        System.out.println(remove(arr,arr.length));
//        remove(arr,arr.length); for debugging

    }
    static String remove(char[] arr,int n){
        int index=0;
        for (int i=0;i<arr.length;i++){
            int j;
            for (j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(i==j){
                arr[index++]=arr[i];
            }
        }
        return  String.valueOf(Arrays.copyOf(arr, index));
    }


}
