package Aptitude.Calendar;

import java.util.Scanner;
public class LinearSearching {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        int[] array=new int[]{2, 3, 4, 10, 40};
        System.out.println(isFound(Linear(array,10)));
    }
    static int Linear(int[] arr,int f){
        int found=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==f){
                System.out.println(f+" is found in index : "+i);
                found++;
            }
        }
        return found;
    }
    static boolean isFound(int found){
        if(found!=0){
            return true;
        }else{
            return false;
        }
    }

}
