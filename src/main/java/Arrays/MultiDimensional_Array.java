package Arrays;

public class MultiDimensional_Array {
    public static void main(String[] args){
        int[][][] array=get_3d();
        System.out.println( array[0][0][4]);
        for (int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                for(int k=0;k<array[i][j].length;k++){
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    static int[][][] get_3d(){
        return new  int[][][]{
                {
                    {1,2,3,4,5},{5,4,3,2,1},{1,2,5,4,3}
                },
                {
                    {1,1,1,1,1,},{2,2,2,2,2},{3,3,3,3,3}
                },
                {
                    {4,4,4,4,4},{5,5,5,5,5},{6,6,6,6,6}
                }
        };
    }
}
