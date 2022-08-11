package Arrays;

public class DuplicateElement {
    static int count=0;
    public static void main(String[] args){
        int arr[]=getArr();
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                  count++;
                }
            }
        }
        if(count==0){
            System.out.println("duplicate element not found");
        }else{
            System.out.println("duplicate element found");
        }
    }
    static int [] getArr(){
        return new int[]{1,2,3,4,5,6,7,8,9,10};
    }
}
