package Collection_Framework.ImplementationDSAlgo.Hashing;

import java.util.HashSet;
import java.util.Set;
public class Intersection {
    public static void main(String[] args){
        int[] arr=new int[]{12,45,78,40,56,23,10};
        int arr1[]=new int[]{10,2,03,0,40,50,60,70,80,90};
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int count=0;
        for(int j:arr1){
            if(set.contains(j)){
                count++;
                set.remove(j);
            }
        }
        System.out.println(count);
    }
}
