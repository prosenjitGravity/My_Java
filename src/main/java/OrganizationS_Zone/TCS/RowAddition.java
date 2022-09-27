package OrganizationS_Zone.TCS;

public class RowAddition {
    public static void main(String[] args){
        int arr[][]=getArr();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
            sum=0;
        }
    }
    static int[][] getArr(){
        return new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
    }
}
