package DSAlgo.Sorting.MergeSorting;

public class MergeSort {
    public static void main(String[] args){
        System.out.println("Un sorted Array : ");
        int arr[]=getArr();
        for (int i=0;i<getArr().length;i++){
            System.out.print(getArr()[i]+" ");
        }
        System.out.println("\nthe Sorting array is : ");
        mergeSort(arr,0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void mergeSort(int[] arr,int start,int end){
        int middle;
        if(start<end){
            middle=(start+end)/2;
            mergeSort(arr,start,middle);
            mergeSort(arr,middle+1,end);
            merging(arr,start,middle,end);
        }
    }
    static void merging(int arr[],int start,int mid,int end){
        int i=start, j=mid+1,index=start;
        int[] b=new int[arr.length];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                b[index]=arr[i];
                i++;
            }else{
                b[index]=arr[j];
                j++;
            }
            if(i>mid){
                while(j<=end){
                    b[index]=arr[j];
                    j++;
                    index++;
                }
            }
            else{
                while(i<mid){
                    b[index]=arr[i];
                    i++;
                    index++;
                }
            }
        }
        for (int k=start;k<=index;k++){
            arr[k]=b[k];
        }
    }
    static int[] getArr(){
        return new int[]{39,9,81,45,90,27,72,18};
    }
}
