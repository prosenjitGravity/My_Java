package Java_In_My_Way;

public class Sub_Array_of_An_Array {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        for(int i=0;i<arr.length;i++) {
           for(int j=i;j<arr.length;j++){
               for(int k=i;k<=j;k++){
                   System.out.print(arr[k]+" ");
               }
               System.out.println();
           }
        }
    }
}
