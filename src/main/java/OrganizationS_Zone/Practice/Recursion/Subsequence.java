package OrganizationS_Zone.Practice.Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args){
        int array[]={3,2,1};
        int length=array.length;
        int i=0;
        ArrayList<Integer> take=new ArrayList<Integer>();
        sequence(i,take,array,length);
    }

    static void sequence(int index, ArrayList<Integer> taking, int[] arr, int n) {
        if(index==n){
            for (Integer i:taking){
                System.out.print(i+" ");
            }
            System.out.println();
            if(taking.size()==0){
                System.out.println("[]");
                return;
            }
        }else {
            sequence(index + 1, taking, arr, n);
            taking.add(arr[index]);
            sequence(index + 1, taking, arr, n);
            taking.remove(taking.size() - 1);
        }
    }
}
