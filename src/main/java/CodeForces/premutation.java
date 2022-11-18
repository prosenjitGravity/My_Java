package CodeForces;

public class premutation {
    public static void main(String[] args) {
        int n=4;
        int[]arr=new int[]{1,2,3,4};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
