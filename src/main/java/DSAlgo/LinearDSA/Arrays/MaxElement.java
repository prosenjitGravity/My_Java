package DSAlgo.LinearDSA.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int arr[] = getArr();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int secMax=arr[1];
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                if(arr[i]>secMax){
                    secMax=arr[i];
                }
            }
        }
        System.out.println("The 1st Max element is  : " + max+" . & and 2nd Max element is  : "+secMax);
    }

    static int[] getArr() {
        return new int[]{12, 45, 78, 98, 65, 32, 30, 20, 10};
    }
}
