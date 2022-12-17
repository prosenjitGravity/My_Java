package Matrix;

public class OneDtoTwoD {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,5,6};
        int l=arr.length/2;
        int [][] arr1=new int[l][l];
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1.length;j++){
                arr1[i][j]=arr[j];
            }
        }
        System.out.println("create array;");
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
