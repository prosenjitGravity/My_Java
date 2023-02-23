package Competitive_Platform.LeetCode.Easy;
import java.util.ArrayList;
import java.util.List;
public class Array_Form_of_Integer {
    public static void main(String[] args){
        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1));
        addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1);
    }
   /* static List<Integer> addToArrayForm(int[] num, int k) {
        System.out.println("toInteger(num,k) : "+toInteger(num,k));
        ArrayList<Integer> ar=new ArrayList<Integer>();
        int[] digits = Integer.toString(toInteger(num,k)).chars().map(c -> c-'0').toArray();
        for(int d : digits)
            ar.add(d);
        return ar;
    }
    static int toInteger(int[] arr,int integer){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum*10+arr[i];
            System.out.println("sum : "+sum);
        }
        return sum;
    }*/
    static public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        for (int i = num.length - 1; i >= 0; --i) {
            ar.add(0, (num[i] + k) % 10);
//            System.out.println("insert : "+ar);
            k = (num[i] + k) / 10;
//            System.out.println("k is  : "+k);
        }
        while (k > 0) {
//            System.out.println("inside while k is : "+k);
            ar.add(0, k % 10);
            k /= 10;
        }
        return ar;
    }
}
