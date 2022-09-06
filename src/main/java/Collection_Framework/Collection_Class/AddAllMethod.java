package Collection_Framework.Collection_Class;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;

public class AddAllMethod {
    public static void main(String[] args)throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1=new ArrayList<Integer>();
        System.out.println("How many element  you want : ");
        int  n=Integer.parseInt(predator.readLine());
        for(int i=0;i<n;i++){
            System.out.println("Enter teh element : ");
            list1.add(Integer.parseInt(predator.readLine()));
        }
        Collections.addAll(list1,10,9,8,6,7);
        for (int i:list1){
            System.out.print(i+" ");
        }
        System.out.println("\nSorted : ");
        Collections.sort(list1);
        for (int i:list1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Searching found : "+Collections.binarySearch(list1,6));
        System.out.println("Searching not found : "+Collections.binarySearch(list1,11));
    }
}
