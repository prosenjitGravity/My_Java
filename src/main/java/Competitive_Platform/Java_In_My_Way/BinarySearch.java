package Competitive_Platform.Java_In_My_Way;

public class BinarySearch {
    public static void main(String[] args){
        int nums[]=new int[]{12,23,43,34,45,54,65,56,57,76,67,90,88,11};
        Println(nums);
        sorting(nums);
        System.out.println();
        Println(nums);
        System.out.println();
        System.out.println(search(nums,43,0,nums.length-1));
    }
    static void sorting(int arr[]){
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
    }
    static void Println(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
    }
    static boolean search(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                search(arr,target,mid+1,end);
            }else {
                search(arr,target,start,mid-1);
            }
        }
        return false;
    }
}
