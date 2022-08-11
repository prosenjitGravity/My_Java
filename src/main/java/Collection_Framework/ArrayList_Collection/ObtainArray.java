package Collection_Framework.ArrayList_Collection;

import java.util.ArrayList;

public class ObtainArray {
    public static void main(String[] args){
        ArrayList<Integer> predator=new ArrayList<Integer>();
        predator.add(10);
        predator.add(20);
        predator.add(30);
        predator.add(40);
        predator.add(50);
        predator.add(60);
        System.out.println(predator);
        Integer[] arr=new Integer[predator.size()];
        arr=predator.toArray(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Total is  : "+sum);
    }
}
