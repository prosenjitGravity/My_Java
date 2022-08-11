package DSAlgo.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stack {
    static int size = 10;
    static int[] memory = new int[size];
    static int top = 0;
    static Scanner predator = new Scanner(System.in);
//    static BufferedReader predator1=new BufferedReader(new InputStreamReader(System.in)); // why doesn't working

    static void Insertion() {
        if (top == memory.length) {
            System.out.println("Stack Memory Is OverFlow");
        } else {
            System.out.println("Enter the element in to the stack memory");
            int data = predator.nextInt();
            System.out.println(data + " element is inserted  in dex is  : " + top);
            memory[top] = data;
            ++top;
        }
    }

    static void Deletion() {
        if (top == 0) {
            System.out.println("Stack memory is UnderFlow");
        } else {
            int delete = memory[top - 1];
            System.out.println(delete + " element is Deleted");
            --top;
        }
    }

    static void Monitoring() {
        if (top == 0) {
            System.out.println("Stack memory doesn't have a element");
        } else {
            for (int i = top - 1; i >= 0; i--) {
                System.out.println(memory[i] + " ");
            }
        }
    }

    static void StackOperation() {
        System.out.println("Press 'i' to push element into the memory");
        System.out.println("Press 'd' to pop element into the memory");
        System.out.println("Press 'm' to monitoring all the memory element");
        System.out.println("Press 'q' to quite stack operations");
        char option;
        do {
            System.out.println("Enter the option below : ");
            option = predator.next().charAt(0);
            switch (option) {
                case 'i':
                    Insertion();
                    break;
                case 'd':
                    Deletion();
                    break;
                case 'm':
                    Monitoring();
                    break;
                case 'q':
                    System.out.println("Quit stack System");
                    break;
                default:
                    System.out.println("Something went wrong " + option + " cannot find ? ");
            }
        } while (option != 'q');
    }

    public static void main(String[] java) {
        StackOperation();
    }
}
