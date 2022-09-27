package LeetCode;

import java.util.Scanner;

public class ReverseStringii {
    public static void main(String[] args){
        Scanner java=new Scanner(System.in);
        String  value=java.nextLine();
        char[] data=value.toCharArray();
        int k=java.nextInt();
        for(int i=0;i<data.length;i+=2*k){
            System.out.println(data[i]);
            int start=i,j=Math.min(i+k-1,data.length-1);
            while(start<j){
                char temp=data[i];
                data[i]=data[j];
                data[j]=temp;
                i++;
                j--;
            }
        }
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]);
        }
    }
}
