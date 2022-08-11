package LeetCode;

public class SmallestElement {
    public static void main(String[] args){
        int matrix[][] = {{1,5,9},{10,11,13},{12,13,15}};
        int kth = 8;
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(KthElement(matrix,kth));
    }
    static int KthElement(int matrix[][],int k){
        int l=0;
        int arr[]=new int[(matrix.length* matrix.length)];
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                arr[l]=matrix[i][j];
//                System.out.println(l);
                if(l==k){
                   return arr[k-1];
                }
                l++;
            }
        }
        return 1;
    }
}
