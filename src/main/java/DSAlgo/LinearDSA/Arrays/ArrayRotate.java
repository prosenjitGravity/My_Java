package DSAlgo.LinearDSA.Arrays;

public class ArrayRotate {
    public static void main(String[] args){
        int arr[] =new int[]{1, 2, 3, 4, 5, 6, 7};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        int location=3;
        int p=1;
        while (p<=location) {
            int last = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = last;
            p++;
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
