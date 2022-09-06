package Collection_Framework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntegerArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader predator = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("How many element you want");
        int size = Integer.parseInt(predator.readLine());
        for (int i = 0; i < size; i++) {
            System.out.println("enter the element : ");
            int element = Integer.parseInt(predator.readLine());
            al.add(element);
        }
        System.out.println(ArraySum(al));
    }

    static int ArraySum(ArrayList<Integer> arr) {
        Set<Integer> set = new HashSet<Integer>(arr);
        int sum=0;
        for (int i : set) {
            sum+=i;
        }
        return sum;
    }
}
