package DSAlgo.Searching_And_Sorting.Sorting;

public class MergeSorting {
    public static void main(String[] args){
        int[] array = new int[]{12, 34, 56, 78, 90, 32, 54, 76, 98, 90};
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        Merge_sort(array,0,array.length-1);
        System.out.println("\n");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    static void Merge_sort(int arr[],int start,int end){
        int mid;
        if(start<end){
            mid=(start+end)/2;

            Merge_sort(arr,start,mid);
            Merge_sort(arr,mid+1,end);
            Merge(arr,start,mid,end);
        }
    }
    static void Merge(int arr[],int start,int mid,int end){
        int temp[]=new int[arr.length];
        int i=start,j=mid+1,index=start;
        while((i<=mid)&&(j<=end)){
            if(arr[i]<arr[j]){
                temp[index]=arr[i];
                i++;
            }else{
                temp[index]=arr[j];
                j++;
            }
        }
        if(i>mid){
            while(j<=end){
                temp[index]=arr[j];
                j++;
                index++;
            }
        }else {
            temp[index]=arr[i];
            i++;
            index++;
        }
        for (int k=start;k<=index;k++){
            arr[k]=temp[k];
        }
    }
}
