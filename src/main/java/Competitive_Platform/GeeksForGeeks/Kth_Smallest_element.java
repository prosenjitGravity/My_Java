package Competitive_Platform.GeeksForGeeks;

public class Kth_Smallest_element {
    public static void main(String[] args){
        System.out.println("Create an array : ");
//        System.out.println(getValue(getArray(),3));
        getValue(getArray(),3);
    }
    static void getValue(int []arr,int k){
        sorting(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void sorting(int array[]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    array[j]=array[j]^array[j+1];
                    array[j+1]=array[j]^array[j+1];
                    array[j]=array[j]^array[j+1];
                }
            }
        }
    }
    static int[] getArray(){
        return new int[]{7,10,4,3,20,15};
    }
}
