package OrganizationS_Zone.Flipkart;

public class DiagonalMatrix {
    public static void main(String[] args){
        System.out.println("Create Matrix");
        for(int i=0;i<getMatrix().length;i++){
            for(int j=0;j<getMatrix().length;j++){
                System.out.print(getMatrix()[i][i]+" ");
            }
            System.out.println();
        }
    }
    static int[][] getMatrix(){
        return new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
}
