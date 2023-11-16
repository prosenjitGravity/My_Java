package DSAlgo.Searching_Sorting.Searching_And_Sorting.Searching;

import java.io.Serializable;
import java.util.Scanner;

public class LinearSearch {
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int Search(int memory[], int target) {
        int location = 0, yes = 0;
        for (int i = 0; i < memory.length; i++) {
            if(memory[i]==target){
                location=i;
                yes=1;
                System.out.println(target+" element found in location is : "+location);
            }
        }
        return yes;
    }

    public static void main(String[] args) {
        display(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("\nEnter the element to be search");
        Scanner predator = new Scanner(System.in);
        int element = predator.nextInt();
        int result = Search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, element);
        if (result !=1) {
            System.out.println(element + " element not found");
        }
    }
}
