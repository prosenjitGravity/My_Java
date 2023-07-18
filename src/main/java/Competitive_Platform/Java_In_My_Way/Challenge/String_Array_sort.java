package Competitive_Platform.Java_In_My_Way.Challenge;

import java.util.Scanner;

public class String_Array_sort {
    static Scanner predator=new Scanner(System.in);
    public static void main(String[] args){
//        System.out.println("enter the value");
//        int n =predator.nextInt();
//        String s=predator.nextLine();
        String[] s_data=new String[]{"Yellow","red","Red","Orange" ,"black"};
        display(s_data);
        System.out.println("\nafter sorting");
        display(sort_data(s_data));

    }
    static String[] sort_data(String[] s){
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){
                if(s[i].compareTo(s[j])<0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        return s;
    }
    static void display(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
