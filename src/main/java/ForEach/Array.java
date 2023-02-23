package ForEach;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Array {
    public static void main(final String[] args) throws IOException{
        BufferedReader predator=new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr=new Integer[5];
        System.out.println("Array is created");
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the "+i+"th element : ");
            arr[i]=Integer.parseInt(predator.readLine());
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
