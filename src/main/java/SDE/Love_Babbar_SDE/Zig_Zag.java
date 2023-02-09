package SDE.Love_Babbar_SDE;

public class Zig_Zag {
    public static void main(String[] args){
        println(getArray());
        System.out.println();
        get_zig_zag(getArray());
    }
    static int[][] getArray(){
        return new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    }
    static void get_zig_zag(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<=i;j++){
                if(i==j){
//                    System.out.print(matrix[i][j]);
                }else{
                    int l=max(i,j);
                    int s=min(i,j);
                    System.out.println(l + " " +s);
                }
            }
        }
    }
    static int min(int x,int y){
        return y>x?x:y;
    }
    static int max( int a,int b){
        return a>b?a:b;
    }
    static void println(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
