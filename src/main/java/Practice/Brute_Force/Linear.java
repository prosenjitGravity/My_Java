package Practice.Brute_Force;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args){
        int arr[]= new int[]{1, 2, 3, 4, 5, 6, 71, 40, 90, 100, 500, 800};
        Scanner predator=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the value what you want : ");
        int target=predator.nextInt();
        int location=-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                location=i;
                break;
            }
        }
        if(location==-1){
            System.out.println("Element not found ! : "+location);
        }else{
            System.out.println("Element found in : "+location);
        }

    }
}
