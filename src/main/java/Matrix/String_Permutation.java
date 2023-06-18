package Matrix;

import java.util.Scanner;

public class String_Permutation {
    public static void main(String[] args){
        Scanner predator=new Scanner(System.in);
        System.out.println("Enter String");
        String s=predator.nextLine();
        permutation(s.toCharArray(),0);
    }
    static void permutation(char[] arr,int start){
        if(start==arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i=start;i<arr.length;i++){
            swap(arr,i,start);
            permutation(arr,start+1);
            swap(arr,i,start);
        }
    }
    static void swap(char[] array,int a,int b){
        char temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
