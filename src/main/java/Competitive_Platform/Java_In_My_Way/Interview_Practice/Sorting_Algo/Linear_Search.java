package Competitive_Platform.Java_In_My_Way.Interview_Practice.Sorting_Algo;

import java.util.Scanner;
public class Linear_Search {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(search(getArray(),1));
        ;
    }
    static boolean search(int[] array,int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("location is : "+i);
                return true;
            }
        }
        return false;
    }
    static int[] getArray(){
        return new int[]{10,9,8,2,7,3,4,9,1,6,5};
    }
}
