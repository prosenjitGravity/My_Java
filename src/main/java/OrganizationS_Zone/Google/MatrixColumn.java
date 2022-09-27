
//        11,12,13,14                 00 01 02 03
//        21,22,23,24                 10 11 12 13
//        31,32,33,34                 20 21 22 23
//        41,42,43,44                 30 31 32 33

//output is  :       00 10 20 30   31 21 11 01   02 12 22 32    33 23 13 03
//original Output :  11 21 31 41   42 32 22 12   13 23 33 43    44 34 24 14
package OrganizationS_Zone.Google;

public class MatrixColumn {                                             // correct answer
    public static void main(String[] args){                             // time complexity is  : O(n^2);
        System.out.println("Create array : ");
        int arr[][]=getArr();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(i%2==0){
                    System.out.print(arr[j][i]+" ");
                }else{
                    System.out.print(arr[arr.length-1-j][i]+" ");
                }
            }
        }

    }
    static int[][] getArr(){
        return new int [][]{{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
    }
}
